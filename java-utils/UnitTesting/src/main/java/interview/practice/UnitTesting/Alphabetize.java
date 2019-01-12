package interview.practice.UnitTesting;

import java.util.Arrays;

public class Alphabetize {

	public static void main(String[] args) {
		System.out.println(new Alphabetize().alphabetize("Sridhar"));;
	}
	
	public String alphabetize(String word) {
		byte[] bytes = word.getBytes();
		return new String(bytes);
	}
}

