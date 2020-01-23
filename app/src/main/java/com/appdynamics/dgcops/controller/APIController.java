package com.appdynamics.dgcops.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.appdynamics.dgcops.model.Platform;
import com.appdynamics.dgcops.utils.JSONUtils;

public class APIController {

	static String token = "ik3s4d3kvitkgipaadve876vul";
	
	public static List<Platform> executeGET(String restURL) throws IOException {

		URL url = new URL(restURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestProperty("Authorization", "Bearer " + token);
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestMethod("GET");
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();
		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();
		String responseString = response.toString();
		//responseString = responseString.substring(1);
		//responseString = responseString.substring(0,responseString.length()-1);
		System.out.println("\n"+responseString+"\n\n");
		return JSONUtils.getPlatformObject(responseString);

	}

	public static String executePOST(String restURL) throws IOException {

		URL url = new URL(restURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestProperty("Authorization", "Bearer " + token);

		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestMethod("POST");

		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String output;

		StringBuffer response = new StringBuffer();
		while ((output = in.readLine()) != null) {
			response.append(output);
		}

		in.close();
		// printing result from response
		System.out.println("Response:-" + response.toString());

		return response.toString();

	}

}
