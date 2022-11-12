package com.c258;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		System.out.print("Enter any Arithemic operatior(+,-,*,/) : ");
		Scanner sc=new Scanner(System.in);
		
		String operator=sc.next();
		
		switch(operator) {
		case "+":
			System.out.print("Enter the first number: ");
			Scanner add=new Scanner(System.in);
			int a=add.nextInt();
			System.out.print("Enter the second number: ");
			int b=add.nextInt();
			System.out.println("The addition of Numbers is: "+ (a+b));
		break;
		
		case "-":
			System.out.print("Enter the first number: ");
			Scanner sub=new Scanner(System.in);
			int c=sub.nextInt();
			int d=sub.nextInt();
			System.out.println("The substraction of Numbers is: "+ (c-d));
		break;
		
		case "*":
			System.out.print("Enter the first number: ");
			Scanner mul=new Scanner(System.in);
			int m=mul.nextInt();
			int n=mul.nextInt();
			System.out.println("The Multiplication of Numbers is: "+ (m*n));
		break;
		
		case "/":
			System.out.print("Enter the first number: ");
			Scanner div=new Scanner(System.in);
			int i=div.nextInt();
			int j=div.nextInt();
			System.out.println("The Division of Numbers is: "+ (i/j));
		break;
		
		default:
			System.out.println("Invalid Input");
		}
	}

}
