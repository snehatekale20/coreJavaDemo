package com.demo.inheritanceDemo;

public class BookDriver {

	public static void main(String[] args) {
		
		Book obj = new Book(1, "python", "dontNo", 9);
		obj.getInfo1();
		obj.parentMethod();
		
		EBook obj1 = new EBook(1, "python", "dontNo", 9, "eBook", "www.eb.com");
		System.out.println("----------------------------------------------------------------");
		obj1.getInfo();
		obj1.childMethod();
		obj1.parentMethod();
		
		
		//we can call parent class method only when we have parent class referance and child class object
		Book obj3 = new EBook(2, "python", "dontNo", 9, "eBook", "www.eb.com");
		System.out.println("----------------------------------------------------------------");
		obj3.getInfo1();
		obj3.parentMethod();
		
		/*
		 * Child1 obj4 = new Child1(1, "python", "dontNo", 9); obj4.show();
		 * 
		 * Child2 obj5 = new Child2(1, "python", "dontNo", 9); obj5.show();
		 */
		
	}
}
