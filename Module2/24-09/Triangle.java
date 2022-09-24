package com.c199;

public class Triangle {
	int a=3,b=4,c=5;
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		int peri=(t1.a+t1.b+t1.c);
		System.out.println("Perimeter of Traiangle is: "+peri);
		int sp=(peri/2);
		int ar=((((sp*(sp-t1.a))*(sp-t1.b))*(sp-t1.c)));
		int area=(int)Math.sqrt(ar);
		System.out.println("Area of Traingle is: "+area);
	}
}
