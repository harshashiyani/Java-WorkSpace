package com.c1211;

class Sender
{
	
	public void send(String msg)
	{
		
		System.out.println("sending "+msg);

			
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(msg+" sent ");
		
		
	}
	
}

class Threadsend extends Thread
{
	String msg;
	Sender sender;
	
	public Threadsend(String msg,Sender sender) 
	{
		// TODO Auto-generated constructor stub
		this.msg=msg;
		this.sender=sender;
	}
	public void run()
	{
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
}

	public class SleepEx
	{
		public static void main(String[] args) {
			
			Sender sd = new Sender();
			Threadsend t1= new Threadsend("hey", sd);
			Threadsend t2=new Threadsend("Welcome", sd);
			Threadsend t3=new Threadsend("Ended", sd);
			
			t1.start();
			//t1.start();
			t2.start();
			t3.start();
			
		}
	}

