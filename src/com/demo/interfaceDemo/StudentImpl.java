package com.demo.interfaceDemo;

public class StudentImpl implements Student{
	
	
	

	@Override
	public void absAndInsMethod() {
		System.out.println(Student.collageName);
		System.out.println("this is overriden method");
	}
	
	public static void main(String[] args) {
		
		StudentImpl stud1 = new StudentImpl();
		
		//with child class object we can call overriden method and default method of interface
		stud1.absAndInsMethod();
		stud1.defaultMethod();
		
		//with interface name we can call static variable and method of interface
		System.out.println(Student.collageName);
		System.out.println(Student.collageName2);
		Student.staticMethod();
	}

}
