package com.demo.nestedClassDemo;

public class StaticClassDemo {
	
	static class StaticInnerClass{
		int a = 20;
		static void show() {
			System.out.println("inside show method of staticInnerClass");
		}
		void print() {
			System.out.println("value of a is : "+a);
			System.out.println("inside print methd");
		}
	}
	
	void mul() {
		System.out.println("ouside static class");
	}
	public static void main(String[] args) {
		
		StaticClassDemo obj = new StaticClassDemo();
		obj.mul();
		
		//to call static inner class method
		StaticInnerClass sobj = new StaticInnerClass();
		StaticInnerClass.show();
		sobj.print();
		
	}

}
