package com.c510;

abstract class Shape{
	
	abstract void RectangleArea(int lenght,int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}

class Area extends Shape{

	@Override
	void RectangleArea(int lenght, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle is : "+(lenght*breadth));
	}

	@Override
	void SquareArea(int side) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is: "+(side*side));
	}

	@Override
	void CircleArea(int radius) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is: "+(3.14*radius*radius));
	}
}

public class Area1 {
	
	public static void main(String[] args) {
		Area a=new Area();
		a.RectangleArea(5, 4);
		a.SquareArea(4);
		a.CircleArea(2);
	}

}
