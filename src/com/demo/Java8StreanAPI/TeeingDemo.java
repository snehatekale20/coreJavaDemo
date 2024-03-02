package com.demo.Java8StreanAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeeingDemo {
	
	public static void main(String[] args) {
		
		//List<String> list = Arrays.asList("Sneha","SS","Tushar","Abc","AA","Smita");
		
		var result = Arrays.asList("Sneha","SS","Tushar","Abc","AA","Smita").stream().collect(Collectors.teeing(Collectors.filtering(n->n.startsWith("S"), Collectors.toList()), 
				Collectors.filtering(n->!n.startsWith("S"), Collectors.toList()), 
				(l1,l2)->{
					Map<String,List<String>> map = new HashMap<>();
					map.put("Starts with 's'",  l1);
					map.put("Other than 'S ': ", l2);
					return map;
					
				}
				));
		
		System.out.println(result);
		
	}

}
