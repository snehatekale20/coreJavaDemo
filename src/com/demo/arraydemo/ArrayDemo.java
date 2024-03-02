package com.demo.arraydemo;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		
		//Creation and declaration of array
		
		//it will create array and initialise to zero
		int stud_array[] = new int[20];
		
		//we can assign length using variable
		int array_size = 30;
		float arr1[] = new float[array_size];
		
		//we can create a array with null
		int[] arr2 = null;
		
		//but we cant create a empty array
		//int[] arr3 = new int[];
		
		//Array access using index
		int emp_arr[] = new int[5];
		 emp_arr[1]=20;
		 emp_arr[3]=10;
		 System.out.println(emp_arr[3]);
		 System.out.println(emp_arr[4]);
		
		
		
	}

}
