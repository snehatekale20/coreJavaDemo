package com.demo.collectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet  set2 = new LinkedHashSet<>();
		
		set2.add("aa");
		set2.add(23);
		set2.add("xyz");
		set2.add(90);
		
		System.out.println(set2);
		
		Iterator iterator = set2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
