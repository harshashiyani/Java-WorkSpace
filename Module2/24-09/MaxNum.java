package com.c258;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		System.out.print("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is greater");
		}
		else if(b>c) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}

	}

}
