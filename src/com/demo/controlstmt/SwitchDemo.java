package com.demo.controlstmt;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		int x = 3;
		String str = "winter";
		char c = 'A';
		
		switch (x) {
		case 1:
			System.out.println("value is 1"+x);
			break;
			
		case 2:
			System.out.println("value is 2 :"+x);
			break;
			
		case 3:
			System.out.println("value is 3 "+x);
			break;

		default:
			System.out.println("this is default");
			break;
		}
		
		
		switch (str) {
		case "winter":
			System.out.println("its a winter");
			break;
			
		case "summer":
			System.out.println("its a summer");
			break;
			
		case "rainy":
			System.out.println("its a rainy");
			break;

		default:
			System.out.println("its a fall");
			break;
		}
		
		switch(c) {
		
		case 's' :
			System.out.println("its s");
			
		case 'a':
			System.out.println("its a");
			
		case 'A' :
			System.out.println("its A");
			break;
			
		default :
				System.out.println("its nothing ");
		}
	}

}
