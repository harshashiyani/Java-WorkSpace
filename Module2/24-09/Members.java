package com.c169;

public class Members {
	String name;
	int age;
	String phone_number;
	String address;
	int salary;
	
	public Members(	String name,
	int age,
	String phone_number,
	String address,
	int salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.phone_number=phone_number;
		this.address=address;
		this.salary=salary;
	}
	
	public void printSalary() {
		// TODO Auto-generated method stub
		System.out.println("Salary of "+name+" is "+salary);
	}

}

class Employee extends Members{
	String specilize;
	
	public Employee(String name,
			int age,
			String phone_number,
			String address,
			int salary,
			String specilize) {
		// TODO Auto-generated constructor stub
		super(name,age,phone_number,address,salary);
		this.specilize=specilize;
	}

}

class Manager extends Members{
	String department;
	
	public Manager(String name,
			int age,
			String phone_number,
			String address,
			int salary,
			String department) {
		// TODO Auto-generated constructor stub
		super(name,age,phone_number,address,salary);
		this.department=department;
	}

}

class Print{
	public static void main(String[] args) {
		Employee emp=new Employee("harsh",22,"*****89891","Rajkot,Gujarat",564000,"IT");
		Manager man=new Manager("John",26,"*****89641","Rajkot,Gujarat",594000,"IT");
		emp.printSalary();
		man.printSalary();

	}
}