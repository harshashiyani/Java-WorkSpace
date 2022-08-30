package com.c278;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.print("Enter the single character:");
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		
		if(n.length()>1) {
			System.out.print("The character of string should not be greater then 1");
		}
		else if(n=="a" || n=="e" || n=="i"  || n=="o"  || n=="u"  || n=="A"  || n=="E"  || n=="I"  || n=="O"  || n=="U") {
			System.out.println(n+" is Vowel");
		}
		else {
			System.out.println(n+" is Consolant");
		}
		
	}

}
