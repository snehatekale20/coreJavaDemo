package com.demo.inheritanceDemo;

public class Book {
	
	int bookId;
	String bookName;
	String author;
	int quantity;
	
	
	public Book(int bookId, String bookName, String author, int quantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.quantity = quantity;
	}
	
	
	void getInfo1() {
		
		System.out.println("Book Id is : " +bookId);
		System.out.println("Book name is : "+bookName);
		System.out.println("Book author is :"+author);
	}
	void parentMethod() {
		System.out.println("from parent class");
	}
	
	
	
	

}
