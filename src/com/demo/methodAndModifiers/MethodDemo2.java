package com.demo.methodAndModifiers;

public class MethodDemo2 {
	
	public static void main(String[] args) {
		
		//we can access static method in another class with class name
		int result = MethodDemo.statMethod(40, 20);
		System.out.println(result);
		
		System.out.println(MethodDemo.statMethod(40, 10));
	}

}
