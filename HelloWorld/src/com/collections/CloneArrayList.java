package com.collections;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("Seshu");
		arrl.add("Rekha");
		arrl.add("Hemanth");
		arrl.add("Sai");
		System.out.println("The Array List is : " +arrl);
		//Using clone() method to clone/copy/Duplicate the ArrayList 
		ArrayList<String> copy = (ArrayList<String>) arrl.clone();
		System.out.println("The Cloned Array is : "+copy);
		//java2novice.com --> Collections & Util Package
	}

}
//toArray()