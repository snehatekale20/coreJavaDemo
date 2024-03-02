package com.demo.Java8MethodReferance;

interface FunctionInterface {
	
	void print();
	
}


interface FunctionDemo{
	void sumf(int a, int b);

}
interface FunDemo{
	
	int mul(int a, int b);
}

public class MethodRefDemo {

	public MethodRefDemo() {
		System.out.println("inside constructor");
	}
	
	 static void show() {
		System.out.println("inside show method");
	}
	 
	 void insMethod() {
		 System.out.println("instance method to mthod referance");
	 }
	 
	 void sum(int a, int b) {
		 System.out.println(a+b);
	 }
	 
	 int multiplication(int a, int b) {
		 return a*b;
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 MethodRefDemo obj = new MethodRefDemo();
		
		 FunctionInterface fc = ()->{System.out.println("print method implementation");;};
		 fc.print();
		 
		 FunctionInterface fc1 = MethodRefDemo::show;
		 fc1.print();
		 
		 FunctionInterface fc2 = obj::insMethod;
		 fc2.print();
		 
		 FunctionInterface fc3 = MethodRefDemo::new;
		 fc3.print();
		 
		 FunctionDemo fd = (a,b)->{System.out.println(a+b);};
		 fd.sumf(10, 30);
		 
		 FunctionDemo fd1 = obj::sum;
		 fd1.sumf(20, 30);
		 
		 FunDemo f1= (a, b) -> {return a*b;};
		 System.out.println(f1.mul(3, 4));
		 
		 
		 
		 
		 
	}
}
