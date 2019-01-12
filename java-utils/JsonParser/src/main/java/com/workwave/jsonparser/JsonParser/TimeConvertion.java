package com.workwave.jsonparser.JsonParser;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConvertion {

     String timeConversion(String s) {
        // get the last two characters of the string
    	String militaryTime = "";
    	String militaryHour = "";
    	if(s.substring(s.length()-2).equalsIgnoreCase("AM")) {
    		militaryHour = s.substring(0,2);
    		int mH = MyInteger.parseInt(militaryHour);
    		if(mH == 12) {
    			militaryHour = "00";}
    		militaryTime = militaryHour+s.substring(2,s.length()-2);
    	} else {
    		militaryHour = s.substring(0,2);
    		int mH = MyInteger.parseInt(militaryHour);
    		if(mH == 12) {
    			militaryHour = "12";}
    		else
    			mH = mH + 12;
    			militaryHour = MyInteger.toString(mH);
    			militaryTime = militaryHour+s.substring(2,s.length()-2);
    		}
    	
    	return militaryTime;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}