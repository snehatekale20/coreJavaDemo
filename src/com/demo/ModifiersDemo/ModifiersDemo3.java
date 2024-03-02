package com.demo.ModifiersDemo;

import com.demo.methodAndModifiers.ModifierDemo;

public class ModifiersDemo3 extends ModifierDemo{
	
	public static void main(String[] args) {
		
		//here we have to create object of child class to access protected method
		ModifiersDemo3 childObj = new ModifiersDemo3();
		
		//here, outside package within child class can access protected and public method only 
		//System.out.println("result: "+childObj.add(20, 20));//default
		//System.out.println("result: "+childObj.sub(20, 10));//private
		System.out.println("result: "+childObj.mul(10, 20));
		System.out.println("result: "+childObj.div(20, 10));
	}

}
