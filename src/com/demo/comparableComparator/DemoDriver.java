package com.demo.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DemoDriver {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "abc", "pune");
		Student s2 = new Student(4, "xyz", "mumbai");
		Student s3= new Student(2, "pqr", "frankfurt");
		Student s4= new Student(1, "xyz", "pune");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("before comparable : "+list);
		
		
		Collections.sort(list);
		System.out.println("after comparable : "+list);
		
		Comparator<Student> onName = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(list, onName);
		System.out.println("after comparator on name : "+list);
	}

}
