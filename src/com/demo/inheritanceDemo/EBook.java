
package com.demo.inheritanceDemo;

public class EBook extends Book {
	
	String bookType;
	String url;
	
	
	public EBook(int bookId, String bookName, String author, int quantity, String bookType, String url) {
		super(bookId, bookName, author, quantity);
		this.bookType = bookType;
		this.url=url;
		// TODO Auto-generated constructor stub
	}
	
	
	void getInfo() {
		super.getInfo1(); //we can get all data from parent class
		System.out.println("Book type is :"+bookType);
		System.out.println("Book url is :"+url);
	}
	
	void childMethod()
	{
		System.out.println("this is child class method");
	}
	

}
