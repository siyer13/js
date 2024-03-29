package com.workwave.jsonparser.JsonParser;

/***
 * 
 * @author Sridhar
 *  Given a string, find sum up all the integers’ inside. For example:
 *	"1abcd45" return 1+45 =46;
 *	"233bc-23" return 233 + 23 = 256;
 *
 */

public class SumInteger {

	public static void main(String[] args) {
		System.out.println(new SumInteger().sumInt("1abcd45"));
		System.out.println(new SumInteger().sumInt("233bc-23"));
	}
	
	public int sumInt(String string) {
		String temp = "";
		int sum = 0;
		int counter = 0;
		for(int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			
			if(Character.isDigit(c)) {
				temp += c;
				counter = 0;
			}
			else {
				if (counter == 0)
				sum = sum + MyInteger.parseInt(temp);
				counter++;
				temp = "";
			}
		}
		sum = sum + MyInteger.parseInt(temp);
		return sum;
	}
}
