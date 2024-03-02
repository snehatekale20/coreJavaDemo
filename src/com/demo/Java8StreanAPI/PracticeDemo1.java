package com.demo.Java8StreanAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeDemo1 {
	
	//1. Java 8 Filter Example: Counting Empty String
	//Example 2: Count String whose length is more than three
	//Count number of String which starts with "a"
	//Remove all empty Strings from List
	//Create a List with String more than 2 characters
	//: Convert String to uppercase and Join them with coma
	//Create a List of the square of all distinct numbers
	//8 Statistics Example: Get count, min, max, sum, and the average for numbers






	
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(30,5,15,50,45,20,80);
		List<String> strlist =Arrays.asList("abab","pqsr","ax","cc","sr","ps","","");
		
		long count = strlist.stream().filter(p->p.isEmpty()).count();
		System.out.println(count);
		
		long count1 = strlist.stream().filter(p->p.length()>3).count();
		System.out.println("lesngth more than 3 is :"+count1);
		
		strlist.stream().filter(p->p.startsWith("a")).forEach(System.out::println);
		//System.out.println("string start with a "+count2);
		
		List<String> collect = strlist.stream().filter(p-> !p.isEmpty()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = strlist.stream().filter(p->p.length()>2).collect(Collectors.toList());
		System.out.println(collect2);
		
		String collect3 = strlist.stream().map(a->a.toUpperCase()).collect(Collectors.joining(" , "));
		System.out.println(collect3);
		
		List<Integer> collect4 = list.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println(collect4);
		
		IntSummaryStatistics summaryStatistics = list.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(summaryStatistics);
	}
	

}
