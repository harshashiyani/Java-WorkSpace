package com.c169;

public class Memb {
	String name;
	int age;
	String phone_number;
	String address;
	int salary;
	
	public void printSalary() {
		// TODO Auto-generated method stub
		System.out.println("Salary of "+name+" is "+salary);
	}

}

class Emp extends Memb{
	String specilize;
}

class Man extends Memb{
	String department;
}

class Main{
	public static void main(String[] args) {
		Emp e=new Emp();
		e.name="Harsh";
		e.age=22;
		e.phone_number="****89891";
		e.address="Rajkot,Gujarat";
		e.salary=57451;
		e.specilize="IT";
		e.printSalary();
		
		Man m=new Man();
		m.name="John";
		m.age=24;
		m.phone_number="****74491";
		m.address="Rajkot,Gujarat";
		m.salary=57451;
		m.department="IT";
		m.printSalary();
	}
}