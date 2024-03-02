package com.demo.controlstmt;

public class IfDemo {
	
	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		String str="Tushar";
		
		if(str=="Sneha") {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		if(a==30 || b==10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(a==20) {
			System.out.println("true");
		}if(a==40) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
