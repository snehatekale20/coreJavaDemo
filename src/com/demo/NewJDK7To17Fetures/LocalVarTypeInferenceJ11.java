package com.demo.NewJDK7To17Fetures;

public class LocalVarTypeInferenceJ11 {
	
	
	static void add(int a, int b) {
		
		var result = a+b; //we can use here
		System.out.println(a+b);
		
		
		for(var i=1;i<10;i++) {  //we can use here
			System.out.println(i);
		}
		
		
	}
	void mul(int x, int y) {
		System.out.println("inside multiplication");
	}
	
	public static void main(String[] args) {
		//we can create object using var
		var obj = new LocalVarTypeInferenceJ11();  //object creation
		obj.mul(2, 4);
		
		String s = "Sneha";
		System.out.println(s);
		
		
		//in java 11
		var s1 ="Sneha";
		System.out.println(s1);
		
		
		var i=2;
		System.out.println(i);
		
		var no = 23.43f;
		System.out.println(no);
		add(2,6);
	}

}
