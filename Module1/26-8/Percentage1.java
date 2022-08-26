package com.c258;

import java.util.Scanner;

public class Percentage1 {

	public static void main(String[] args) {
		System.out.print("Enter the percentage: ");
		Scanner sc= new Scanner(System.in);
		
		int percentage=sc.nextInt();
		
		if(percentage>75) {
			System.out.println("Distinction");
		}
		else if(percentage<=75 && percentage>60) {
			System.out.println("First Class");
		}
		else if(percentage>50 && percentage<=60) {
			System.out.println("Second Class");
		}
		else if(percentage>35 && percentage<=50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fails");
		}
	}

}
