package com.demo.methodAndModifiers;

public class MethodDemo {
	
	//instance method
	int insMethod(int a, int b) {
		
		int result = a+b;
		return result;
	}
	//static method
	static int statMethod(int c,int d) {
		int result2 = c-d;
		return result2;
	}
public static void main(String[] args) {
	
	MethodDemo obj1 = new MethodDemo();
	//to print result of instance meythod we can have a two ways
	//first way is :
	int printResult = obj1.insMethod(20, 30);
	System.out.println(printResult);
	
	//second way is :
	System.out.println(obj1.insMethod(20, 30));
	
	//to print static method's result we don't need object
	int printResult2 = statMethod(30, 20);
	System.out.println(printResult2);
	
	//we can also print it like:
	System.out.println(statMethod(30, 20));
}
}
