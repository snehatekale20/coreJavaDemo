package com.demo.abstractClassDemo;

public abstract class Employee {
	
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	abstract void absMethod();
	
	void insMethod() {
		statMethod();
		privatemethod();
		System.out.println("method body of instance method");
		System.out.println(empId);
		System.out.println(empName);
	}
	
	static void statMethod() {
		
		System.out.println("static method in absrtact class");
	}
	
	private void privatemethod() {
		statMethod();
		System.out.println("private method of abstract class");
	}
	
	/*Default methods are allowed only in interfaces.
	 * default void defMethod() {
	 * 
	 * }
	 */
	
	
	

}
