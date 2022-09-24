
package com.c169;

class A{
	void parent() {
	System.out.println("This is Parent class");
	}
}

class B extends A{
	void child() {
	System.out.println("This is Child class");	
	}
}

class C extends B{
	void child2() {
	System.out.println("This is child class 2");
	}
}


public class SingleInherit {
	public static void main(String[] args) {
		C obj=new C();
		obj.parent();
		obj.child();
		obj.child2();
	}

}
