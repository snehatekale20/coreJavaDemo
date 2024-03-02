package com.demo.collectionDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList<>();
		
		list1.add("ll1");
		list1.add("ll2");
		list1.add("ll3");
		list1.add("ll4");
		
		ListIterator listIterator = list1.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
			//listIterator.add("aa");
		}
		System.out.println("==========================================================");

		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println(list1);

		System.out.println("==========================================================");
		
		System.out.println(list1.get(0));
		System.out.println(list1);
		System.out.println(list1.contains("ll3"));
		list1.addFirst("ll0");
		System.out.println(list1);
		list1.addLast("115");
		System.out.println(list1);
		
		System.out.println(list1.element());
		
		System.out.println(list1.getFirst());
		
		System.out.println(list1.indexOf("ll4"));
		
		System.out.println(list1.offer("last"));
		System.out.println(list1);
		
		System.out.println(list1.offerFirst("first"));
		System.out.println(list1);
		
		
		//retrive and remove the head
		System.out.println(list1.poll());
		
		




	}
	
	

}
