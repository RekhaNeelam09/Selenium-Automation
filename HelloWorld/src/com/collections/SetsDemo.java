package com.collections;
//ctrl + shift + o Wanted imports will come and unwanted imports will be removed
//import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetsDemo {

	public static void main(String[] args) {
//In 'Sets' duplicates will not be allowed and no insertion Order...
//In 'LinkedHashSet' , duplicates will not be allowed and insertion order is also followed...		
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20); 
		h.add(10);
		h.add(40);
		h.add(50);
		System.out.println(h);
	}
//java2novice.com
}
