package com.demo.nestedClassDemo;


interface Abc{
	void showInterface();
}
public class AnonimousInnerClass {
	
	public static void main(String[] args) {
		Abc obj = new Abc() {
			
			@Override
			public void showInterface() {

				System.out.println("inside interface");
			}
		};
		
		obj.showInterface();
	}

}
