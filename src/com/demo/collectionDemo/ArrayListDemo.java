package com.demo.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>(3);
		list2.add("890");
		list2.add("345");
		list2.add("678");
		System.out.println("list 2 : "+list2);
		
		list1.add("abc");
		list1.add("xzy");
		list1.add("123");
		list1.add("pqr");
		list1.add("abc");
		System.out.println(list1);
		list1.add(2, "345");
		System.out.println("list 1 : "+list1);
		
		list1.addAll(1, list2);
		System.out.println("after adding list 2 :"+list1);
		System.out.println(list1.retainAll(list2));
		System.out.println("After retain method : "+list1);

		System.out.println(list1.contains("909"));
		System.out.println(list1.containsAll(list2));
		
		System.out.println(list1.equals(list2));
		List list3 = new ArrayList<>();
		list3.addAll(list2);
		
		list1.forEach(System.out::println);

		System.out.println("resut of get : "+list1.get(3));
		int i = list1.indexOf("abc");
		System.out.println("index of method : "+i);
		System.out.println("list is emty : "+list1.isEmpty());
		System.out.println(list1.lastIndexOf("abc"));
		System.out.println(list1.remove(2));
		System.out.println(list1.removeAll(list2));
		
		list1.forEach(System.out::println);
		System.out.println(list1.retainAll(list1));
		System.out.println(list1);

		System.out.println(list1.set(1, "456"));
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		System.out.println(list1.subList(1, 3));
		
		Object[] array = list1.toArray();
		for(int j=0;j<=array.length-1;j++) {
			System.out.println(array[j]);
		}
		
		System.out.println("contains result : "+list1.contains("abc"));

		


		
	}

}
