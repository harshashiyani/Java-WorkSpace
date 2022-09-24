package com.c169;

public class IntChar {
	static void form(int n,char c) {
		// TODO Auto-generated method stub
		System.out.println("Interger: "+n+" Char: "+c);

	}
	static void form(char c, int n) {
		// TODO Auto-generated method stub
		System.out.println("Char: "+c+" Interger: "+n);

	}
	
	public static void main(String[] args) {
		IntChar obj=new IntChar();
		obj.form(255, 'H');
		obj.form('A', 75);
	}

}
