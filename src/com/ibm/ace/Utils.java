package com.ibm.ace;

public class Utils {
	
	public static String getSystemTimeMilliSeconds() {
		//this code returns system time ms as a String
		String value = "-1";
		
		value = String.valueOf(System.currentTimeMillis());
		
		return value;
	}
	
}
