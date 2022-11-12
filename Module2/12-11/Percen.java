package com.c510;

abstract class Marks{
	abstract void getPercentage();
}

class A extends Marks{
	
	int eng,math,sci;
	
	public A(int English, int Maths, int Science) {
		// TODO Auto-generated constructor stub
		eng = English;
		math=Maths;
		sci=Science;
		
	}

	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		float sum=eng+math+sci;
		float per=((sum/300)*100);
		System.out.println("Percentage of Student A is: "+per);
	}
	
}

class B extends Marks{
	
	int it,cs,comp,ict;
	
	public B(int IT,int CS, int COMP,int ICT) {
		// TODO Auto-generated constructor stub
		it=IT;
		cs=CS;
		comp=COMP;
		ict=ICT;
	}

	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		float sum=it+cs+comp+ict;
		float per=((sum/400)*100);
		System.out.println("Percentage of Student A is: "+per);
	}
	
}

public class Percen {
	
	public static void main(String[] args) {
		A a=new A(89,92,84);
		a.getPercentage();
		B b=new B(76,85,93,84);
		b.getPercentage();
	}

}
