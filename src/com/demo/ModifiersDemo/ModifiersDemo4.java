package com.demo.ModifiersDemo;

import com.demo.methodAndModifiers.ModifierDemo;

public class ModifiersDemo4 {

	public static void main(String[] args) {
		
		ModifierDemo obj = new ModifierDemo();
		
		//in different package and non child class we can access only public method
		//System.out.println("result: "+obj.add(20, 20));//default
		//System.out.println("result: "+obj.sub(20, 10));//private
		//System.out.println("result: "+obj.mul(10, 20));//protected
		System.out.println("result: "+obj.div(20, 10));//public

	}
}
