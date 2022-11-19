package com.a1711;

import java.util.ArrayList;
import java.util.Iterator;

public class UpdateElemArr {
public static void main(String[] args) {
	ArrayList list = new ArrayList<>();
	list.add("Red");
	list.add("Orange");
	list.add("Yellow");
	list.add("Green");
	list.add("Blue");
	list.add("Red");
	list.add("Voilet");
	
	list.add(0,"Pink"); //add element at first position
	
	
	list.set(4, "White");//updated element at index number 4
	System.out.println(list+"\n");
	
	Iterator i= list.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
