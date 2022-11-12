package com.c258;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.print("Enter the weak number:");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid number of week");
		}
	}
}
