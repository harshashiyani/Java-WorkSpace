package com.c278;

public class String_Count {
	public static void main(String[] args) {
		String str="My School name is Scholars 124 @ 67 .com";
		count(str);
		
	}

	private static void count(String str) {
		char[] ch=str.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println("The String is: "+str);
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("number: "+num);
		System.out.println("other: "+other);
	}
}
