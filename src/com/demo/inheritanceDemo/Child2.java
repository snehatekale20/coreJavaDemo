package com.demo.inheritanceDemo;

public class Child2 extends Child1{
	
public Child2(int bookId, String bookName, String author, int quantity) {
		super(bookId, bookName, author, quantity);
		// TODO Auto-generated constructor stub
	}

void show() {
	super.show();
	super.getInfo1();
	System.out.println("this is child2");
}

}
