package com.demo.collectionDemo;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet  set1 = new HashSet<>();
		
		set1.add("sneha");
		set1.add("abc");
		set1.add(23);
		set1.add('c');
		set1.add(null);
		
		System.out.println(set1);
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(20);
		set2.add(90);
		set2.add(23);
		
		System.out.println(set2);
		System.out.println(set1.addAll(set2));
		System.out.println(set1);
		
		System.out.println(set1.containsAll(set2));
		
		set1.forEach(System.out::println);
		
		System.out.println("hashcode of set1 is : "+set1.hashCode());
		
		System.out.println("size of set1: "+set1.size());
		
		System.out.println("remove method: "+set1.remove("sneha"));
		System.out.println(set1);
		
		System.out.println("retain all method : "+set1.retainAll(set2));
		System.out.println(set1);


		
	}

}
