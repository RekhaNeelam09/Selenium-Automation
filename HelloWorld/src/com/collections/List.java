package com.collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("Rekhamma");
		a.add(12.34f);
		a.add("Dumbu");
		//To print the ArrayList through reference Variable
		System.out.println(a);
		//To get an Element through Index
		System.out.print(a.get(1));
		//To check whether the array is Empty or with Elements
		System.out.println(a.isEmpty());
		//To get the length of the ArrayList in Collections
		System.out.println(a.size());
		//To get the index of particular Element 
		System.out.println(a.indexOf("Rekhamma"));
		//To check whether the Element text contains
		System.out.println(a.contains("amma"));
		//To get hashCode
		System.out.println(a.hashCode());
		System.out.println(a);
		a.add(40);
		System.out.println(a);
		// To be added in particular index
		a.add(1,"Dumbugadu");
		System.out.println(a);
		//To replace Dumbugadu with Dumbuga
		a.set(1, "Dumbuga");
		System.out.println(a);
		//To get Sub List from the ArrayList
		System.out.println(a.subList(2, 5));
		// To remove a particular Element
		a.remove(1);
		System.out.println(a);
		//To remove an Element based on that Element
		a.remove("Dumbuga");
		System.out.println(a);
		//To remove entire List
		a.clear();
		System.out.println();
		//java2novice.com
	}

}
