package com.demo.ExceptionDemo;

public class InvalidAgeUnchecked extends RuntimeException{
	
	String msg;

	public InvalidAgeUnchecked(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	

}
