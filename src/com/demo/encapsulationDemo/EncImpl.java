package com.demo.encapsulationDemo;

public class EncImpl extends EncapsulationDemo{
	
	public static void main(String[] args) {
		
		EncapsulationDemo obj1 =new EncapsulationDemo();
		EncImpl obj2 = new EncImpl();
		obj2.setId(2);
		obj2.setName("Tushar");
		System.out.println(obj2.getId());
		System.out.println(obj2.getName());
		obj1.setId(1);
		obj1.setName("Sneha");
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
	}

}
