package me.jackferg.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.apphb.huxley.client.*;
import com.apphb.huxley.huxley.api.*;
import com.apphb.huxley.huxley.model.*;
import com.sun.javafx.image.impl.ByteIndexed.Getter;

import javafx.scene.input.DataFormat;

public class Main {

	private static String accessToken = getpassword();
	private static String id = "SLY";
	private static boolean debug = true;
	private static ArrayList<String> checked;
	private static HashMap<String, Integer> greatestDelay = new HashMap<String, Integer>(); 

	public static void main(String[] args) {
		bigLoop();
	}

	public static void bigLoop() {

		intaliseFile();
		checked = fileToArrayList();
		
		while (true) {

			update();

			try {
				if (debug) {
					System.out.println("wait");
					Thread.sleep(10000);
					System.out.println("wait end");
				} else
					Thread.sleep(300000);
			} catch (InterruptedException e) {
				System.out.println("Thread sleep made this error happen");
			}
		}
	}

	public static void update() {
		ArrivalsBoard arrivals = getJsonObject();
		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date currentTime = new Date();
		String[] current = (dateFormat.format(currentTime)).split(":");
		int currentHour = Integer.valueOf(current[0]);
		int currentMinute = Integer.valueOf(current[1]);
		
		//resets when no trains running
		if (currentHour == 4){
			writeArrayList(new ArrayList<String>());
		}
		
		
		for (TrainServicesField train : arrivals.getTrainServicesField()) {
			
			if (train.getEtaField().equals("On time") || train.getEtaField().equals("Delayed")){
				continue;
			} else {
				try {
					
					String[] trainSta = (train.getStaField()).split(":");
					int staHour = Integer.valueOf(trainSta[0]);
					int staMinute = Integer.valueOf(trainSta[1]);
					
					String[] trainETA = (train.getEtaField()).split(":");
					int etaHour = Integer.valueOf(trainETA[0]);
					int etaMinute = Integer.valueOf(trainETA[1]);
					
					System.out.println(getTimeDiff(currentHour, currentMinute, etaHour, etaMinute));
					
					int delay = 0;
					
					//if the delay amount has increased
					if (greatestDelay.containsKey(train.getrsidField()) && ((delay = getTimeDiff(staHour, staMinute, etaHour, etaMinute)) > greatestDelay.get(train.getrsidField()))){
						updateData(delay-greatestDelay.get(train.getrsidField()));
						greatestDelay.put(train.getrsidField(), delay);
					}
					
					//if there is a delay thats not already been added
					if (!checked.contains(train.getrsidField()) && (getTimeDiff(currentHour, currentMinute, etaHour, etaMinute)<6)){
						delay = getTimeDiff(staHour, staMinute, etaHour, etaMinute);
						updateData(delay);
						checked.add(train.getrsidField());
						writeArrayList(checked);
						greatestDelay.put(train.getrsidField(), delay);
					}
					
				} catch (Exception e) {
					System.out.println("error in date parsing");
				}
			}
			
			if (!checked.contains(train.getrsidField())){
				
			}
			
			System.out.println("train name: " + train.getrsidField());
			System.out.println("train sta: " + train.getStaField());
			System.out.println("train eta: " + train.getEtaField());
			System.out.println("");
		}
	}
	
	public static int getTimeDiff(int staHour, int staMins, int etaHour, int etaMins){
				
		int diff = 0;
		
		if (staHour != etaHour){
			diff = (((etaHour-staHour) * 60) - staMins) + etaMins;
		} else {
			diff = (etaMins - staMins);
		}
		
		return diff;
	}
	
	public static void writeArrayList(ArrayList<String> arr){
		try{
		FileWriter writer = new FileWriter("checked.txt"); 
		for(String str: arr) {
		  writer.write(str + "\n");
		}
		writer.close();
		} catch (Exception e) {
			System.out.println("error with the writing of the array to a file");
		}
	}
	
	public static ArrayList<String> fileToArrayList(){
		ArrayList<String> list = new ArrayList<String>();
		try{
			Scanner s = new Scanner(new File("checked.txt"));
			while (s.hasNext()){
			    list.add(s.next());
			}
			s.close();
		} catch (Exception e) {
			System.out.println("error with the reading of the file to a array");
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public static void updateData(int data){
		try{
		setData(Integer.valueOf(getFile()) + data);
		}catch (Exception e) {
			System.out.println("error updating the data");
		}
	}

	//TODO need to add abilty to take date from file and add it back
	public static void setData(int data) {
		String text1 = "";
		try {
			BufferedReader brTest = new BufferedReader(new FileReader("current.txt"));
			brTest.readLine();
			text1 = brTest.readLine();
			brTest.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("current.txt");
			writer.println(data);
			writer.println(text1);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getFile() {
		String text = "";
		try {
			BufferedReader brTest = new BufferedReader(new FileReader("current.txt"));
			text = brTest.readLine();
			brTest.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if (text == "") {
			System.out.println("error with getting current delay");
			System.exit(0);
		}
		return Integer.valueOf(text);
	}

	public static ArrivalsBoard getJsonObject() {

		ArrivalsBoard response = null;

		try {
			ArrivalsApi arrivalsApi = new ArrivalsApi();
			response = arrivalsApi.getArrivalsBoard(accessToken, id);

		} catch (ApiException e) {
			System.out.printf("ApiException caught: %s\n", e.getMessage());
		}

		return response;
	}

	public static String getpassword() {
		String text = "";
		try {
			BufferedReader brTest = new BufferedReader(new FileReader("password.pass"));
			text = brTest.readLine();
			brTest.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if (text == "") {
			System.out.println("error with getting to token");
			System.exit(0);
		}
		return text;
	}
	
	public static void intaliseFile(){
		String[] toInput = new String[2];
		toInput[0] = "0";
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date date = new Date();
		toInput[1] = dateFormat.format(date);
		try{
			FileWriter writer = new FileWriter("current.txt"); 
			for(String str: toInput) {
			  writer.write(str + "\n");
			}
			writer.close();
			
			writer = new FileWriter("checked.txt"); 
			writer.write("");
			
			} catch (Exception e) {
				System.out.println("error with the writing of the array to a file");
			}
	}

}
