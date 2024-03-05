package com.demo.Java8StreanAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentFactory {
	
	public static void main(String[] args) {
		
		Student st1 = new Student(3, "john", "munic", 6045);
		Student st2 = new Student(5, "aohn", "berlin", 6047);
		Student st3 = new Student(4, "sohn", "pune", 5045);
		Student st4 = new Student(1, "xyz", "wagholi", 8045);
		Student st5 = new Student(8, "pqr", "pune", 6022);
		Student st6 = new Student(9, "ass", "munic", 6040);
		Student st7 = new Student(7, "abc", "han", 5545);
		Student st8 = new Student(4, "sohn", "pune", 6325);
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		list.add(st7);
		list.add(st8);
		
		System.out.println(list);
		
		//Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
		//System.out.println("after name sorting : "+list);
		
		List<Student> collect = list.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Student> collect2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorting naturally: "+collect2);
		
		list.stream().filter(e->e.getName().startsWith("a")).forEach(s->System.out.println(s));
		
		//we can also write it as
		System.out.println("---------------------------------");

		list.stream().filter(e->e.getName().startsWith("a")).forEach(System.out::println);
		
		//we can aslo write it as
		System.out.println("---------------------------------");
		List<Student> listWitha = list.stream().filter(e->e.getName().startsWith("a")).collect(Collectors.toList());
		System.out.println(listWitha);
		
		list.stream().map(i->i.getName().toUpperCase()).forEach(System.out::println);
		Student student = list.stream().findFirst().get();
		System.out.println(student);
		
		list.stream().map(s->s.getId()+1).forEach(System.out::println);
		
		list.stream().skip(2).forEach(System.out::println);
		
		//using teeing method
		
		var collectThis = list.stream().collect(Collectors.teeing(Collectors.filtering(a->a.getName().startsWith("a"), Collectors.toList()),
				Collectors.filtering(a->!a.getName().startsWith("a"), Collectors.toList()), 
				(li1,li2)->/*{
						List<List<Student>> list1 = new ArrayList();
						list1.add(li1);
						list1.add(li2);
						return list1;
				}*/
		
		{
					
					Map<String,List<Student>> m1 = new HashMap<>();
					m1.put("Starts with 'a' : ",li1);
					m1.put("String without 'a' : ", li2);
					return m1;
					
				
		}
			
		));
		
		System.out.println(collectThis);
		
		
	var collectInt =	list.stream().collect(Collectors.teeing(Collectors.filtering(s->s.getId()>=4, Collectors.toList()), Collectors.filtering(s->s.getId()<4, Collectors.toList()), 
				(l1,l2)->{
					
					Map<String, List<Student>> map = new HashMap<>();
					map.put("id greater than 4: ", l1);
					map.put("id less than 4: ", l2);
					return map;
					
				}
		
				
				));
	
	System.out.println(collectInt);
		
		
		
		
	}

}
