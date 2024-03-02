package com.demo.Java8functionalInterface;


@FunctionalInterface
interface functionIn{
	
	void write();
	
	
	default void m1() {
		System.out.println("default method");
	}
	
	private void m2() {
		System.out.println("private method");
	}
	
	
}

public class Demo1 {
	
	public static void main(String[] args) {
		
		functionIn fun = new functionIn() {
			
			@Override
			public void write() {
				System.out.println("this is functional interface");
			}
		};
		fun.write();
		
		functionIn lambda = ()->{System.out.println("this is functional interface using lambda");};
		lambda.write();
	}

}
