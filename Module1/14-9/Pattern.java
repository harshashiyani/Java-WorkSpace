package com.c278;

public class Pattern {
	public static void main(String[] args) {
		int i,j,k=1;
		for(i=0;i<4;i++) {
			for(j=0;j<i+1;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println("");
		}
	}

}
