package com.demo.comparableComparator;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private String address;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int id, String name, String adddress) {
		
		this.id=id;
		this.name=name;
		this.address=adddress;
	}
	 
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.id > o.id) {
		return 1;
		}else if(this.id < o.id) {
			return -1;
		}else {
			return 0;
		}
	}

	
}
