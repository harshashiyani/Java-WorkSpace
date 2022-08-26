package com.c258;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		System.out.println("Enter 1 for area of triangle");
		System.out.println("Enter 2 for area of rectangle");
		System.out.println("Enter 3 for area of circle");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.print("Enter the base of the Triangle: ");
			Scanner tir=new Scanner(System.in);
			int b=tir.nextInt();
			System.out.print("Enter the height of the Triangle: ");
			int h=tir.nextInt();
			System.out.println("Area of Trianle is: "+ (0.5*b*h));
		}
		else if(num==2) {
			System.out.print("Enter the length of the Rectangle: ");
			Scanner rec=new Scanner(System.in);
			int l=rec.nextInt();
			System.out.print("Enter the bredth of the Reactangle: ");
			int b=rec.nextInt();
			System.out.println("Area of Reactangle is: "+ (l*b));
		}
		else if(num==3) {
			System.out.print("Enter the radius of circle: ");
			Scanner cir=new Scanner(System.in);
			int r=cir.nextInt();
			System.out.println("Area of Reactangle is: "+ (3.14*r*r));
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
