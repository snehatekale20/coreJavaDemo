package com.demo.arraydemo;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		//Array initialization
		
		
		//first way
		int[] arr1 = new int[4];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=25;
		
		//second way
		int[] arr2 = {10,30,40,50};
		
		
		//third way
		int[] arr3 =null;
		arr3 = new int[] {20,30,55,9,8};
		
		//we can assign values to array using for loop
		int[] arr4 = new int[50];
		int j=10;  //j is a value we want to put in array
		
		//this loop will assign values to array
		for(int i=0;i<=49;i++) {
			arr4[i]=j;
			j = j+10;
			
		}
		
		//this loop will print an array
		for(int i=0;i<=49;i++) {
			System.out.println(arr4[i]);
		}
		
	}

}
