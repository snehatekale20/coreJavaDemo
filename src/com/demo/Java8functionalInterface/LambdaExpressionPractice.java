package com.demo.Java8functionalInterface;

import java.lang.invoke.LambdaConversionException;

interface function1 {

	void m1();

}

interface function2 {

	void m2(int a, int b);
}

interface function3 {

	int m3();
}

interface function4 {

	int m4(int x, int y);
}

public class LambdaExpressionPractice {

	public LambdaExpressionPractice() {
		System.out.println("inside constructor");
	}

	public static void show() {
		System.out.println("this is static method");
	}

	public void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		LambdaExpressionPractice obj = new LambdaExpressionPractice();

		// function1 f1 = ()->System.out.println("method 1");
		// f1.m1();
		function1 f11 = LambdaExpressionPractice::show;
		f11.m1();

		function1 f111 = LambdaExpressionPractice::new;
		f111.m1();

		function2 f2 = (a, b) -> System.out.println("Addition is : " + (a + b));
		f2.m2(23, 20);

		function2 f22 = obj::add;
		f22.m2(12, 10);

		function3 f3 = () -> {
			System.out.println("inside m3");
			return 4;
		};
		System.out.println(f3.m3());

		function4 f4 = (c, d) -> {
			int result = c + d;
			return result;
		};
		System.out.println("m4 is : " + f4.m4(6, 8));

	}

}
