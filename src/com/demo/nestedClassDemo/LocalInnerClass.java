package com.demo.nestedClassDemo;

public class LocalInnerClass {

	void show() {
		
		System.out.println("inside show method");
		
		class LocalInner{
			static int i=10;
			static void demoMethod() {
				System.out.println("static method");
			}
			void add() {
				System.out.println("value of i is : "+i);
				System.out.println("inside local class");
			}
		}
		LocalInner obj1 = new LocalInner();
		obj1.add();
		LocalInner.demoMethod();

		System.out.println("end of method ");
		}
	
	void sub() {
		
		System.out.println("outside of local inner class");
	}
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.sub();
		obj.show();
		
		
	}
}
