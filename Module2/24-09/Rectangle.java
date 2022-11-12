package com.c199;

public class Rectangle {
	static int length;
	static int breadth;
	
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is: "+(length*breadth));

	}
	
	void Parameter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of rectangle is: "+(2*(length+breadth)));

	}
	
	public Rectangle(int l,int b) {
		// TODO Auto-generated constructor stub
		length=l;
		breadth=b;
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle(5, 4);
		r.Parameter();
		r.area();
		
		Square sqr=new Square(5);
		sqr.Parameter();
		sqr.area();
	}

}

class Square extends Rectangle{
	int side;

	public Square(int s) {
		super(s, s);
		// TODO Auto-generated constructor stub
	}
	
}
