package com.c510;

import java.util.Scanner;

public class AgeExcep {
	public static void main(String[] args) {
		System.out.print("Enter your age: ");
		Scanner sc=new Scanner(System.in);
		try {
			int age=sc.nextInt();
			if(age<18) {
				throw new ArithmeticException("not valid");
			}
			else {
				System.out.println("Welcome to vote");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
