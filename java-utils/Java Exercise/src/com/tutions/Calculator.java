package com.tutions;

public class Calculator {
	
	private int x;
	private int y;
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int add(int x , int y) {
		return x+y;
	}
	int sub(int x , int y) {
		if(x > y) {
		return x-y;
		} else
			return y-x;
	}
	int mul(int x , int y) {
		return x*y;
	}
	int div(int x , int y) {
		return x/y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Calculator(){
		
	}
	
}
