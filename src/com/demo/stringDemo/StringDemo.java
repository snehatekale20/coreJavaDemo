package com.demo.stringDemo;

import java.util.StringTokenizer;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2="ABC";
		String s3= new String("ABC");
		
		
		//== check memory location of string 
		if(s2==s3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(s1==s2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(s2.equals(s3)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String str = "Hi this is string related class";
		String[] strArray = str.split(" ");
		for( String s: strArray) {
			System.out.println(s);	
		}
		
		String str2 = str.toUpperCase();
		System.out.println(str2);
		
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.charAt(4)); //character of 3rd index
		
		char[] c = str.toCharArray();
		for(char c1 : c) {
			System.out.println(c1);
			
		}
		
		//method return zero if value stored in varieble or object is same
		int value = s3.compareTo(s2);
		System.out.println("CompareTo method: "+value);
		
		//ignore the case sensitive
		int val = s1.compareToIgnoreCase(s2);
		System.out.println(" compareToIgnoreCase method: "+val);
		
		
		
		System.out.println(str.concat( s2));
		
		System.out.println(str.replace("class", "lecture"));
		
		//it is mutable it does not create new object when we modify sb.  
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" java");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
		StringBuilder sd = new StringBuilder("String");
		sd.append(" Builder");
		System.out.println(sd);
		
		
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
