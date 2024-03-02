package com.demo.NewJDK7To17Fetures;

//in jdk14
public class SwitchStatementExpression {

	// before jdk14
	void switchmethod() {
		int day = 4;
		switch (day) {

		case 1:
			System.out.println("sunday");

		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		default:
			System.out.println("this is defaoult");

		}
	}

	// after jdk14
	void switchMethod2() {
		int day = 2;
		switch (day) {

		case 1 -> System.out.println("sunday");

		case 2 -> System.out.println("monday");

		case 3 -> System.out.println("tuesday");

		default -> System.out.println("this is defaoult");

		}

	}

	void switchMethod3() {
		int day = 1;
		String s = switch (day) {

		case 1 -> "sunday";

		case 2 -> "monday";

		case 3 -> "tuesday";

		default -> "this is defaoult";

		};
		System.out.println(s);
	}

	public static void main(String[] args) {

		int day = 2;
		String s = switch (day) {

		case 1 -> {
			System.out.println("enhanced switch");
			yield "sunday";  //yield is use to return and break
		}

		case 2 -> {
			System.out.println("enhanced switch");
			yield "Monday";
		}

		case 3 -> "tuesday";

		default -> "this is defaoult";

		};
		System.out.println(s);

	}
}