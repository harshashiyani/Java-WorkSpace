package com.c199;

import java.util.Scanner;

public class Complex {
	
	int real,imaginary;
	
	Complex(){
		
	}
	
	Complex(int tempReal, int tempImaginary) {
		// TODO Auto-generated constructor stub
		real=tempReal;
		imaginary=tempImaginary;
	}
	
	Complex addComp(Complex c1,Complex c2) {
		Complex temp=new Complex();
		
		temp.real=c1.real+ c2.real;
		
		temp.imaginary=c1.imaginary+c2.imaginary;
		
		return temp;
		
	}
	
	Complex subComp(Complex c1,Complex c2) {
		Complex temp=new Complex();
		
		temp.real=c1.real- c2.real;
		
		temp.imaginary=c1.imaginary-c2.imaginary;
		
		return temp;
		
	}
	
	Complex productComp(Complex c1,Complex c2) {
		Complex temp=new Complex();
		
		temp.real=c1.real* c2.real;
		
		temp.imaginary=c1.imaginary*c2.imaginary;
		
		return temp;
		
	}
	
	void printComplexNumber(){
		System.out.println("Complex Number : "+real+" + " +imaginary +" i ");
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the first complex Real Number Digits: ");
		Scanner sc=new Scanner(System.in);
		int num1= sc.nextInt();
		
		System.out.print("Enter the first complex Imaginary Number Digits: ");
		int num2=sc.nextInt();
		
		System.out.print("Enter the second complex Real Number Digits: ");
		int num3=sc.nextInt();
		
		System.out.print("Enter the first complex Imaginary Number Digits: ");
		int num4=sc.nextInt();
		
		Complex c1=new Complex(num1,num2);
		c1.printComplexNumber();
		
		Complex c2=new Complex(num3,num4);
		c2.printComplexNumber();
		
		
		Complex c3=new Complex();
		
		c3=c3.addComp(c1, c2);
		System.out.println("Addition is : ");
		c3.printComplexNumber();
		
		c3=c3.subComp(c1, c2);
		System.out.println("Substraction is : ");
		c3.printComplexNumber();
		
		c3=c3.productComp(c1, c2);
		System.out.println("Multiplication is : ");
		c3.printComplexNumber();
		
		
	}
}
