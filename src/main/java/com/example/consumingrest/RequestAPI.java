package com.example.consumingrest;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class RequestAPI {

	private static HttpURLConnection connection;
	
	public static void main(String[] args) {
		BufferedReader reader;
		String line;
		StringBuffer response_content = new StringBuffer();
		
		try {
			URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?lat=3D&lon=139&appid=b6907d289e10d714a6e88b30761fae22");
			connection= (HttpURLConnection) url.openConnection();
			
			//requestSetup
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			int status = connection.getResponseCode();
			
			if(status>299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while((line = reader.readLine()) != null) {
					response_content.append(line);
				}
				reader.close();	
			}
			
			else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					response_content.append(line);
				}
				reader.close();	
			}
			System.out.println(response_content.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
		}
		
	
		public static void parse (String response1){ 
		    JSONArray array= new JSONArray(response1);
		    for (int i = 0 ;i <array.length();i++){
		       JSONObject obj = array.getJSONObject(i);
		        String name = obj.getString("name");
		        System.out.println(name);
		    }
			}
		
		
	}
}
*/