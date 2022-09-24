package com.c169;

public class Find {
	
	static void interleaving(String s1,int i,String s2,int j,String inter) {
		// TODO Auto-generated method stub
		if(i==s1.length()&&j==s2.length()) {
			System.out.println(inter);
		}
		if(i<s1.length()) {
			interleaving(s1,i+1,s2, j, inter+s1.charAt(i));
		}
		if(j<s2.length()) {
			interleaving(s1,i,s2, j+1, inter+s2.charAt(j));
		}

	}
	
	public static void main(String[] args) {
		String s1="WX";
		String s2="YZ";
		
		interleaving(s1,0,s2,0,"");
	}
}
