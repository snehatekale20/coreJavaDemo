package com.demo.ExceptionDemo;

public class InvalidAgeCheckedException extends Exception {
	
	String masg;

	public InvalidAgeCheckedException(String masg) {
		super(masg);
		this.masg = masg;
	}
	
	

}
