package com.demo.ExceptionDemo;

import java.io.IOException;

public class UnEcheckedExceptionDemo {
	
	public static void main1(String[] args) {
		
		int a =10;
		int b =0;
		
		//here we will get uncheckedException its not necessary to handle but we can handle it.
		int result = a/b;
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
		try {
			int a =10;
			int b =0;
			
			int result = a/b;
			System.out.println(result);
			}catch(ArithmeticException   | ArrayIndexOutOfBoundsException ex) {
				System.out.println("value must be non zero");
			}catch(Exception e) {
				
			}finally {
				System.out.println("Always Execute");
			}
	}

}
