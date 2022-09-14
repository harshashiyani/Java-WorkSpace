package com.c139;

public class Divisible35 {
	
	public static void main(String[] args) {
		//divisible(100);
		int i=0;
		for(i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" ");
			}
		}
	}

}
