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
import java.util.Date;
import java.util.Scanner;

import com.apphb.huxley.client.*;
import com.apphb.huxley.huxley.api.*;
import com.apphb.huxley.huxley.model.*;

public class Main {

	private static String accessToken = getpassword();
	private static String id = "SLY";
	private static boolean debug = true;
	private static ArrayList<String> checked;

	public static void main(String[] args) {
		bigLoop();
	}

	public static void bigLoop() {

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
		System.out.println(dateFormat.format(currentTime));
		
		
		for (TrainServicesField train : arrivals.getTrainServicesField()) {
			
			if (train.getEtaField().equals("On time")){
				continue;
			} else {
				try {
					Date trainETA = dateFormat.parse(train.getEtaField());
					System.out.println(currentTime.getTime() -  trainETA.getTime());
				} catch (ParseException e) {
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
	
	public static void writeArrayList(ArrayList<String> arr){
		try{
		FileWriter writer = new FileWriter("checked.txt"); 
		for(String str: arr) {
		  writer.write(str);
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

	public static void setData(int data) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("current.txt");
			writer.print(data);
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

}
