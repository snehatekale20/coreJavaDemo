package com.demo.collectionDemo;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack s  = new Stack<>();
		
		s.addElement("s1");
		s.add("s2");
		s.add("s4");
		s.add(3, "s3");

		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.push("s5"));
		System.out.println(s);
		
		System.out.println(s.elementAt(2));
		s.forEach(System.out::println);
		
		System.out.println(s.capacity());


	}

}
