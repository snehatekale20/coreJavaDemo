package com.demo.NewJDK7To17Fetures;

public class DemoDriver {

	public static void main(String[] args) {
		 RecordDemo obj = new RecordDemo(2, "Sneha", "pune");
		 obj.show();
		 RecordDemo.m1();
		 System.out.println("from another class : "+RecordDemo.colgName);
		 System.out.println(obj);
		
	}

}
