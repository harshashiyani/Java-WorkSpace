package com.c1211;

class M1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread M: "+i);		
		}
	}
	
}
class N1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread N: "+i);
		}
	}
	
}

public class ThreadRunnable 
{
	public static void main(String[] args) {
		
		M1 m =new M1();
		N1 n =new N1();
		
		Thread t1 =new Thread(new M1());
		Thread t2 =new Thread(new N1());
		
		t1.start();
		t2.start();
	}
}