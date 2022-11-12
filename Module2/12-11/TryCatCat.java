package com.c510;

public class TryCatCat {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/5;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
	}
}
