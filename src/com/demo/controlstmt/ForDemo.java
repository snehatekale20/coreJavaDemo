package com.demo.controlstmt;

public class ForDemo {
  //use of continue
	public static void main(String[] args) {
		
		//it will print 1 to 100
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		
		
		// it will print up to 105
		for(int i=1; i<=200 ;i++) {
			System.out.println(i);
			if(i==105) {
				break;
			}
		}
			
		
		//it will skip 20 and print other values from 1 to 50
		for(int i=1;i<=50;i++) {
			if(i==20) {
				continue;
			}
			System.out.println(i);

	
		}
		
//		//infinite loop
//		for( ; ;) {
//			System.out.println("hello");
//		}
//		
		
	}
	
}
