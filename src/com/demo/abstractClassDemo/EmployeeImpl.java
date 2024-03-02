package com.demo.abstractClassDemo;

public class EmployeeImpl extends Employee {
	
	//first we have to override constructor
	public EmployeeImpl(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	//then abstractmethod
	@Override
	void absMethod() {

		System.out.println("Overriden method of abstract class");
	}
	
	
	
	public static void main(String[] args) {

		EmployeeImpl emp1 = new EmployeeImpl(2, "Sneha");
		System.out.println("my id is : "+emp1.empId);
		emp1.insMethod();
		emp1.absMethod();
		EmployeeImpl.statMethod();
		
	}

	

}
