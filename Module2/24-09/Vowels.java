package com.c278;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.print("Enter the single character:");
		Scanner sc = new Scanner(System.in);
		char n=sc.next().charAt(0);
		
		if(n=='a' || n=='e' || n=='i'  || n=='o'  || n=='u'  || n=='A'  || n=='E'  || n=='I'  || n=='O'  || n=='U') {
			System.out.println(n+" is Vowel");
		}
		else if((n>='a' && n<='z')||(n>='A'&&n<='Z')){
			System.out.println(n+" is Consolent");
		}
		else {
			System.out.println(n+" is not Alphabet");
		}
	}

}
