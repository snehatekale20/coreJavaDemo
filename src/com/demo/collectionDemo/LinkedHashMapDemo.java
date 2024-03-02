package com.demo.collectionDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		System.out.println(lmap.size());
		lmap.put(1, "abc");
		lmap.put(4, "pqr");
		lmap.put(3, "sneha");
		lmap.put(2, "aaa");
		
		System.out.println(lmap);
		
		
	}
}
