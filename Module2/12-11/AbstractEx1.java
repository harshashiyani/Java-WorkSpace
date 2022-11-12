package com.c510;

abstract class Parent{
	abstract void message();
}

class Assing extends Parent{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}
	
}

class Assign1 extends Parent{

	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
	
}

public class AbstractEx1 {
	public static void main(String[] args) {
		Assing ass=new Assing();
		ass.message();
		Assign1 ass1=new Assign1();
		ass1.message();
		
	}
}
