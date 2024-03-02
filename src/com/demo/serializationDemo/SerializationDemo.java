package com.demo.serializationDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	ExternalizationDemo empEx = new ExternalizationDemo(3, "tushar", "alegao", "tush@gmail.com", 6778998, 67);
			
			
	
	void serialization() {
		
		Employee emp = new Employee(2, "Sneha", "frankfurt", "sneha@gmail.com", 27363677, 23);
		
		try {
			ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream("emp.txt"));
			objs.writeObject(emp);
			objs.close();
			System.out.println("updated");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void deserializationDemo() {
		
		try {
			ObjectInputStream obji=new ObjectInputStream(new FileInputStream("emp.txt"));
			Object obj1 = obji.readObject();
			obji.close();
			Employee emp1 =(Employee)obj1;
			System.out.println(emp1.empName);
			System.out.println(emp1.empId);
			System.out.println(emp1.empAddress);
			System.out.println(emp1.number);
			System.out.println(emp1.salary);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void writeExternal() {
		
		try {
			ObjectOutputStream objo1 = new ObjectOutputStream(new FileOutputStream("empEx.txt"));
			objo1.writeObject(empEx);
			objo1.close();
			System.out.println("updated");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void readExternal() {
		
		try {
			ObjectInputStream obji = new ObjectInputStream(new FileInputStream("empEx.txt"));
			Object obj2 = obji.readObject();
			ExternalizationDemo empex = (ExternalizationDemo) obj2;
			obji.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		SerializationDemo obj = new SerializationDemo();
		//obj.serialization();
		//obj.deserializationDemo();
		//obj.writeExternal();
		obj.readExternal();
		
	}

}
