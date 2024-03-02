package com.demo.ExceptionDemo;

public class UserDefinedException {
	
	void checkAgeChecked(int age) throws InvalidAgeCheckedException {
		
		if(age>18) {
			System.out.println("valid age");
		}else {
			throw new InvalidAgeCheckedException("age is not enogh");
		}
	}
	
void checkAgeUnChecked(int age) {
		
		if(age>18) {
			System.out.println("valid age");
		}else {
			throw new InvalidAgeUnchecked("age is not enogh");
		}
	}
	
	public static void main(String[] args) {
		UserDefinedException obj = new UserDefinedException();
		try {
			obj.checkAgeChecked(14);
		} catch (InvalidAgeCheckedException e) {
			e.printStackTrace();
		}
		
		
		//this is unchecked exception
		obj.checkAgeUnChecked(14);
		
	}

}
