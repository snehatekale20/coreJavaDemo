package com.demo.Java8functionalInterface;

interface functionDemo{
	void sum(int a, int b);
}

public class Demo2 {
	
	public static void main(String[] args) {
		
		functionDemo f1 = new functionDemo() {
			
			@Override
			public void sum(int a, int b) {
				int result =a+b;
				System.out.println(result);
			}
		};
		f1.sum(30, 50);
		
		functionDemo f2 =(a,b)->{ System.out.println(a+b);};
		f2.sum(10, 20);

}
}