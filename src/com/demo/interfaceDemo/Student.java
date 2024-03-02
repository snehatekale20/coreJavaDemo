package com.demo.interfaceDemo;

public interface Student {
	
	
	//this variable is bydefault public static final
	String collageName="JSPM";
	public static final String collageName2="ABCD";
	
	//this is abstract /instance method and we cant write method body
	void absAndInsMethod();
	
	
	
	//these methods we can write inside interface after JDk 1.8
	
	public static void staticMethod() {
		System.out.println(collageName);
		System.out.println("this is static method of interface");
	}
	
	default void defaultMethod() {
		privateMethod();
		System.out.println("this is defaoult method of interface");
	}
	
	private void privateMethod() {
		System.out.println("this is private method of interface");
	}

}
