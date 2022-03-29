package com.collections;

import java.util.LinkedHashMap;
import java.util.Set;
//HashMap is a non legacy class which introduced in jdk whereas Hashtable is a Legacy class.
//HashMap is fast whereas HashTable is slow
public class LinkedHMDemo
{
	public static void main(String[] args) 
	{
		// In HashMap , the arguments are based on 'Key' 'Values',it will not allow duplicates and has no insertion order
		// LinkedHashMap will have insertion order
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
		//We use Put() instead of add() for adding objs in Maps 
		lhm.put(10,100);
		lhm.put(20,200);
		lhm.put(10,300);
		lhm.put(30,400);
		lhm.put(40,200);
		System.out.println(lhm);
		System.out.println(lhm.get(10));
		System.out.println(lhm.size());
		System.out.println(lhm.hashCode());
		System.out.println(lhm);
		System.out.println(lhm);
		
		
	}

}
