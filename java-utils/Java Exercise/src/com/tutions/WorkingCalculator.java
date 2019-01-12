package com.tutions;

public class WorkingCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator(180,200);
		int z = cal.add(10, 20);
		System.out.println(z);
		z = cal.mul(10, 20);
		System.out.println(z);
		
		z = cal.sub(60, 100);
				System.out.println(z);
		//cal.setX(100);
		//System.out.println(cal.getX());
				
	  for(int i = 1; i <= 10; i++) {
		  System.out.println(i);
	  }
	}

}
