package com.c510;

import java.util.Scanner;

public class TryEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		try {
			int a[]=new int[5];
			a[5]=x/y;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
	}
}
