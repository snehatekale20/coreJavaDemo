package com.demo.serializationDemo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationDemo implements Externalizable{
	
	int empid;
	String empName;
	String empAddress;
	String email;
	float salary;
	long number;
	
	

	public ExternalizationDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExternalizationDemo(int empid, String empName, String empAddress, String email, float salary, long number) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAddress = empAddress;
		this.email = email;
		this.salary = salary;
		this.number = number;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(empid);
		out.writeObject(empName);
		out.writeObject(empAddress);
		out.writeObject(email);
		out.writeLong(number);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		int id = in.readInt();
		String name = (String) in.readObject();
		String address = (String) in.readObject();
		String email = (String) in.readObject();
		long number = in.readLong();
		
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("address : "+address);
		System.out.println("email : "+email);
		System.out.println("number : "+number);

		
		

		
	}
	

}
