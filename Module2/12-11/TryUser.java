package com.c510;

import java.util.Scanner;

public class TryUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			int data=a/b;
			System.out.println(data);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
