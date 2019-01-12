package com.tutions;

public class Addition {

	public static void main(String[] args) {
		/*int x = 10;
		int y = 20;
		int z = x + y;
	   System.out.println("On adding " + x + " and " + y + " we get : " + z);
	   x = 100;
	   y = 200;
	   z = x + y;
	   System.out.println("On adding " + x + " and " + y + " we get : " + z);*/
		
		System.out.println(new Addition().add(1088,28880));
	}
	
	public String add(int x, int y) {
		int z = x+y;
		String result = "On adding " + x + " and " + y + " we get : " + z;
		return result;
	}

}


