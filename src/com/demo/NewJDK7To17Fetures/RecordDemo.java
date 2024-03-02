package com.demo.NewJDK7To17Fetures;

public record RecordDemo(int rollNo , String name, String add) {
	
	public static String colgName = "abcd";
	
	void show() {
		System.out.println("inside show");
		System.out.println("rollNno is"+rollNo);
		System.out.println("name is : "+name);
	}
	static void m1() {
		System.out.println("STatic method");
		System.out.println(colgName);
	}

}

