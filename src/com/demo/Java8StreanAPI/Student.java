package com.demo.Java8StreanAPI;

public class Student implements Comparable<Student>{

	int id;
	String name;
	String add;
	int pincode;

	public Student(int id, String name, String add, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.pincode = pincode;
	}

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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.getId() < o.getId())
			return -1;
		else if(this.getId()>o.getId())
			return 1;
		else
		return 0;
	}

}
