package com.ibm.ace;

public class Utils {
	
	public static String getSystemTimeMilliSeconds() {
		
		String value = "-1";
		
		value = String.valueOf(System.currentTimeMillis());
		
		return value;
	}
	
}
