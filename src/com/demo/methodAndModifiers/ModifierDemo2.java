package com.demo.methodAndModifiers;

public class ModifierDemo2 {

	public static void main(String[] args) {
		ModifierDemo obj = new ModifierDemo();
		
		//within same package but different class private method sub is not accessible
		System.out.println("result: "+obj.add(20, 20));
		//System.out.println("result: "+obj.sub(20, 10));//private
		System.out.println("result: "+obj.mul(10, 20));
		System.out.println("result: "+obj.div(20, 10));
	}
}
