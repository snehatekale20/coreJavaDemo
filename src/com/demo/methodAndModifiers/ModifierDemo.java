package com.demo.methodAndModifiers;

public class ModifierDemo {
	
	 int add(int a, int b) {
		int result1 = a+b;
		return result1;
		
	 }
	 
	 private int sub(int a, int b) {
		 int result2=a-b;
		 return result2;
		 
	 }
	 
	 protected int mul(int a, int b) {
		 int result3 = a*b;
		 return result3;
	 }
	 
	public int div(int a, int b) {
		 int result4 = a/b;
		 return result4;
	 }
	
	
	public static void main(String[] args) {
		
		ModifierDemo obj = new ModifierDemo();
		
		//within same class all access modifiers are accessible
		System.out.println("result: "+obj.add(20, 20));
		System.out.println("result: "+obj.sub(20, 10));
		System.out.println("result: "+obj.mul(10, 20));
		System.out.println("result: "+obj.div(20, 10));

	}

}
