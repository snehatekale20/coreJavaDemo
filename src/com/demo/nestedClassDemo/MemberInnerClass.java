package com.demo.nestedClassDemo;

public class MemberInnerClass {
	
	
	//this is inner class or instance class
	class InnerClass{
		
		void show() {
			System.out.println("inside inner class");
		}
	}
	
	void print() {
		System.out.println("inside print method");
	}
	
	public static void main(String[] args) {
		
		MemberInnerClass obj = new MemberInnerClass();
		obj.print();
		
		MemberInnerClass.InnerClass io = obj.new InnerClass();
		io.show();
	}

}
