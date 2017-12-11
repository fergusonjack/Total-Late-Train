package me.jackferg.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.apphb.huxley.client.*;
import com.apphb.huxley.huxley.api.*;
import com.apphb.huxley.huxley.model.*;

public class Main {

	private static String accessToken = getpassword();
	private static String id = "SLY";

	public static void main(String[] args) {
		getJsonObject();
	}

	public static ArrivalsBoard getJsonObject() {

		ArrivalsBoard response = null;

		try {
			ArrivalsApi arrivalsApi = new ArrivalsApi();
			response = arrivalsApi.getArrivalsBoard(accessToken, id);
			// System.out.println(response.getTrainServicesField());

			//System.out.println(response);
			System.out.println(response.getTrainServicesField().get(0).getEtaField());

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
