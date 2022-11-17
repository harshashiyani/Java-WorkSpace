package com.c1211;

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A: "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B: "+i);
		}
	}
}

public class ExtendsThreads 
{
	public static void main(String[] args) {
		
		System.out.println("Thread Executed");
		A a =new A();
		B b =new B();
		
		a.start();
		//a.start();
		b.start();
		System.out.println("Thread Ended");
		
	}
}