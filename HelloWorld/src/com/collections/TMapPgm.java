package com.collections;

import java.util.TreeMap;

public class TMapPgm {

	public static void main(String[] args) {
		//TreeMap will also not allow the duplicate keys but will gives the result in 'Ascending Order' 
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		tm.put(10,100);
		tm.put(20,200);
		tm.put(10,300);
		tm.put(30,400);
		tm.put(40,200);
		
		TreeMap<String,Integer> tm1 = new TreeMap<String,Integer>();
		tm1.put("Rekha",100);
		tm1.put("Hemu",200);
		tm1.put("Sesha",300);
		tm1.put("Ruthwik",400);
		tm1.put("Sai",200);
		System.out.println(tm);
		System.out.println(tm.get(10));
		System.out.println(tm.size());
		System.out.println(tm.hashCode());
		System.out.println(tm);
		System.out.println(tm);
		System.out.println(tm1);
		
	}

}
