package com.c510;

class Shape1{
	void a() {
		System.out.println("This is this is Shape");
	}
}

class Rectangle1 extends Shape1{
	void b() {
		System.out.println("This is Rectangular shape");
	}
}

class Circle1 extends Shape1{
	void c() {
		System.out.println("This is Circular shape");
	}
}

class Square1 extends Rectangle1{
	void d() {
		System.out.println("Square is Rectangle");
	}
}

public class Shapes {
	public static void main(String[] args) {
		Square1 sq=new Square1();
		sq.a();
		sq.b();
		sq.d();
		Circle1 cr=new Circle1();
		cr.c();
	}
}
