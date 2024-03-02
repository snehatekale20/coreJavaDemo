package com.demo.dt;

public class VariableTypes {
	
	
	int insVar;
	
	public static int staticVar;
	
	public VariableTypes() {
		System.out.println("This is default constructore");
	}
	public static void main(String[] args) {
		int local=10;
		System.out.println("Local variable: "+local);
		//Object creation
		VariableTypes varType = new VariableTypes();
		System.out.println("instance variable using obj ref : "+varType.insVar);
		System.out.println("instance variable using obj  : "+new VariableTypes().insVar);
		System.out.println("Static variable: "+staticVar);
	}

}
