package com.demo.arraydemo;

public class LargestNumberArray {
	
	public static void main1(String[] args) {
			
			int arr[] = {60,50,200,13,80};
			
			int largestNum = 0;
			
			
			for(int i=0;i<arr.length-1;i++) {
				
				for(int j=1;j<arr.length;j++) {
					
					if(arr[i] < arr[j]) {
						 arr[i]=arr[j];
					}
				}
			}
			largestNum =arr[0];
			
			System.out.println("largest element : "+largestNum);
			
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {60,500,200,13,80};
		
		int largestNum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largestNum) {
				largestNum=arr[i];
			}
		}
		System.out.println("largest Number: "+largestNum);
		
		
	}

}
