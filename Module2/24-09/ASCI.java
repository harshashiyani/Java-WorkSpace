package com.c278;

import java.util.Scanner;

public class ASCI {
	public static void main(String[] args) {
		System.out.print("Enter the character here: ");
		Scanner sc=new Scanner(System.in);
		char str=sc.next().charAt(0);
		int ascii_value=str;
		System.out.println("ASCII value of "+str+" is "+ascii_value);
	}
}
