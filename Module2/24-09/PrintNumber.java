package com.c169;

public class PrintNumber {
	static void printn(int n) {
		// TODO Auto-generated method stub
		System.out.println("Integer: "+n);
	}
	static void printn(double n) {
		// TODO Auto-generated method stub
		System.out.println("Double: "+n);
	}
	static void printn(float n) {
		// TODO Auto-generated method stub
		System.out.println("Float: "+n);

	}
	static void printn(String n) {
		// TODO Auto-generated method stub
		System.out.println("String: "+n);

	}
	static void printn(char n) {
		// TODO Auto-generated method stub
		System.out.println("Char: "+n);

	}
	static void printn(boolean n) {
		// TODO Auto-generated method stub
		System.out.println("Boolean: "+n);

	}
	
	public static void main(String[] args) {
		PrintNumber obj=new PrintNumber();
		obj.printn(254484623);
		obj.printn(25.3564);
		obj.printn(2.564f);
		obj.printn("String");
		obj.printn('H');
		obj.printn(true);
		
		
	}

}
