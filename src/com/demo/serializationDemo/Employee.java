package com.demo.serializationDemo;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
	private static final long serialVersionUID = 12L;
	
	int empId;
	String empName;
	String empAddress;
	String email;
	long number;
	//when we use transient it will store default value of salary in file
	//i.e. salary field will not serialize
	transient float salary;
	
	
	public Employee(int empId,String empName,String empAddress,String email,long number,float salary) {
		
		this.empId=empId;
		this.empName=empName;
		this.empAddress=empAddress;
		this.email=email;
		this.number=number;
		this.salary=salary;
	}
	

}
