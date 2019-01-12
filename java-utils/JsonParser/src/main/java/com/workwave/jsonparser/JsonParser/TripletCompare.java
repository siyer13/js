package com.workwave.jsonparser.JsonParser;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TripletCompare {

	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int[] result = new int[2];
		int alice = 0;
		int bob = 0;
		if (a0 > b0 || a1 > b1 || a2 > b2) {
			alice++;
		}
		if (a0 < b0 || a1 < b1 || a2 < b2) {
			bob++;
		}
		result[0] = alice;
		result[1] = bob;
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int[] result = solve(a0, a1, a2, b0, b1, b2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

	}
}


