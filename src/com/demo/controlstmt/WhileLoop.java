package com.demo.controlstmt;

public class WhileLoop {
	public static void main(String[] args) {
		
		int i=1;
		
		//this will print 1 to 100
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		//it will print infinite loop bcz we are not incrementing i
		while(i<=100) {
			System.out.println(i);
			
		}
		
		
	}
	
	

}
