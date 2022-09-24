package com.c169;

public class AreaSqrRec {
	static void AreaSquareCircle(int length,int breadth) {
		// TODO Auto-generated method stub
		System.out.println("Area of Reactangle is: "+(length*breadth));

	}
	static void AreaSquareCircle(int side) {
		// TODO Auto-generated method stub
		System.out.println("Ares of Square is: "+(side*side));

	}
	
	public static void main(String[] args) {
		AreaSqrRec obj=new AreaSqrRec();
		obj.AreaSquareCircle(5, 5);
		obj.AreaSquareCircle(2);
	}

}
