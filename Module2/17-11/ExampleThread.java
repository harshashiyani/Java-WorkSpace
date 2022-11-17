package com.c1211;

import java.util.Iterator;

/*class Task{
	void executeTask() {
		for(int doc=0;doc<=10;doc++) {
			System.out.println("@@Printing Document "+doc+" from Printer 2");
		}
	}
}*/

class Task extends Thread implements Runnable{
	@Override
	public void run() {
		for(int doc=1;doc<=10;doc++) {
			System.out.println("@@Printing Document "+doc+" from Printer 2");
		}
	}

}

public class ExampleThread {
	public static void main(String[] args) {
		System.out.println("Application Started");
		
		Task tx=new Task();
		//tx.executeTask();
		
		for(int doc=1;doc<=10;doc++) {
			System.out.println("^^Printing Document : "+doc+" from Printer 1");
		}
		System.out.println("Application Ended");
	}


}
