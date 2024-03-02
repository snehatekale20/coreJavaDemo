package com.demo.Java8StreanAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("pqr");
		list.add("abc");
		list.add("aw");
		list.add("pqr");
		
		Stream<String> stream = list.stream();
		
		Predicate< String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				
				return t.startsWith("a");
			}
		};
		
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		//stream.filter(p).forEach(c);
		//we replaces above two methods in this single line
		//stream.filter(p1 -> p1.startsWith("a")).forEach((c1)->System.out.println(c1));
		
		List<String> collect = stream.filter(p2 -> p2.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println(list.stream().count());
		list.stream().sorted().forEach(System.out::println);
		list.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		
		
		//to sort list in ascending order
		List<Integer> asList = Arrays.asList(20,20,40,50,10,60,10,25);
		asList.stream().sorted().forEach(System.out::println);
		
		
		//to sort list in descending order
		List<Integer> list3 = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("descending order of list : "+list3);
		
		//fond max element from list
		int maxelement = asList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println("max element of list is : "+maxelement);
		
		//fond second max element from list
		int secmaxelement = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("second max element of list is : "+secmaxelement);
		
		//find smallest element from list
		int smallestElement = asList.stream().sorted().findFirst().get();
				System.out.println("smalest element : "+smallestElement);
				
		//print the sum of all elements
		int sum = asList.stream().mapToInt(e->e).sum();
		System.out.println("sum of all element : "+sum);
		
		
		//list of distinct element not repeated element
		List<Integer> distinct = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		//flatMap
		List<List<Integer>> fltList = new ArrayList<>();
		List<Integer> l1 = Arrays.asList(23,34,56,89,9,77,11,22);
		List<Integer> l2 = Arrays.asList(10,34,65,78,34,77);
		List<Integer> l3 = Arrays.asList(98,76,54,32,99);
			fltList.add(l1);
			fltList.add(l2);
			fltList.add(l3);
		System.out.println(fltList);
		List<Integer> listnew = fltList.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(listnew);
		
		//count the characters from the given string
		
		String str = "Snehatushar";

		Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		map.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::print);
		
		Optional<String> op = Optional.ofNullable(null);
		if(op.isPresent() && !op.isEmpty()) {
			System.out.println("get"+op.get());
		}else {
			System.out.println("empty");
		}
		
		
		
	}
	

}
