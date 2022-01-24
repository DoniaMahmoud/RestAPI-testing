package com.example.consumingrest;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.json.JSONArray;


public class StaticData {
   
	 String str;
	 int Int;
	 
	JSONObject object;
	{    String json= "{\"name\":\"Congo\",\"capital\":\"Brazzaville\",\"population\":4741000}"
			+ " {\"name\":\"France\",\"capital\":\"Paris\",\"population\":66710000}"
			+" { \"name\":\"Philippines\",\"capital\":\"Manila\",\"population\":103279800}";
			object = new JSONObject (json);
	}
	  
		public String getString(String key) {
		
			str= object.getString(key);
			System.out.print(str);
			return str;

		}
		public int getInt(String key)
		{
			
			Int= object.getInt(key);
			System.out.print(Int);
			return Int;

		}		    	
		
		boolean ValidateCountryName() {
			   String expected = "Congo";
		       Countries countries = new Countries();
		       countries.setName(expected);
		       String actual=  countries.getName();
		      boolean Found=false;
		      if(actual.equals(expected)) {
		    	  Found = true;
		    	  
		      }
		      return Found;
			}
				    	
		boolean ValidateCountryCapital() {
			   String expected = "Brazzaville";
		       Countries countries = new Countries();
		       countries.setCap(expected);
		       String actual=  countries.getCap();
		      boolean Found=false;
		      if(actual.equals(expected)) {
		    	  Found = true;
		      }
		      return Found;
			}
		
		boolean ValidateCountryPop() {
			   int expected = 4741000;
		       Countries countries = new Countries();
		       countries.setPop(expected);
		       int actual=  countries.getPop();
		      boolean Found=false;
		      if(actual==expected) {
		    	  Found = true;
		      }
		      return Found;
			}
		
		public boolean CheckAll() {
			  boolean Found1= ValidateCountryName();
			  boolean Found2=ValidateCountryCapital();
			  boolean Found3 =ValidateCountryPop();
			  if (Found1 && Found2 && Found3)
			     return true;
			  else 
				  return false;
		}
		
		
		
				    		  
}