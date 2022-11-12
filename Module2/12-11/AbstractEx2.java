package com.c510;

abstract class Assingment{
	abstract void getMessage();
}

class BankA extends Assingment{
	void getMessage() {
		System.out.println("$100");
	}
}

class BankB extends Assingment{
	void getMessage() {
		System.out.println("$150");
	}
}

class BankC extends Assingment{
	void getMessage() {
		System.out.println("$200");
	}
}

public class AbstractEx2 {
	public static void main(String[] args) {
		BankA a= new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		a.getMessage();
		b.getMessage();
		c.getMessage();
	}
}
