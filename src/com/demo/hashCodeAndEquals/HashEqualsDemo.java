package com.demo.hashCodeAndEquals;

import java.util.HashMap;

public class HashEqualsDemo {
	
	
	public static void main(String[] args) {
		
	
	Student s1 = new Student(1, "abc", "pune");
	Student s2 = new Student(4, "xyz", "mumbai");
	Student s3= new Student(2, "pqr", "frankfurt");
	Student s4= new Student(1, "abc", "pune");
	
	HashMap<Student, String> studMap = new HashMap<>();
	studMap.put(s1, "abc");
	studMap.put(s2, "mumbai");
	studMap.put(s3, "pqr");
	studMap.put(s4, "abc");
	
	
	
	System.out.println(studMap);
	
	}
}
