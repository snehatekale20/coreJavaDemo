package com.demo.inheritanceDemo;

public class Child1 extends Book{
	
	public Child1(int bookId, String bookName, String author, int quantity) {
		super(bookId, bookName, author, quantity);
		// TODO Auto-generated constructor stub
	}

	void show() {
		super.getInfo1();
		System.out.println("this is chid1");
	}

}
