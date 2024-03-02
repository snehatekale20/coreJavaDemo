package com.demo.arraydemo;

public class SmallestNumberArray {
	
	public static void main1(String[] args) {
		
		int arr[] = {6,50,2,130,8};
		
		int smallstNum = 0;
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i] > arr[j]) {
					 arr[i]=arr[j];
				}
			}
		}
		smallstNum =arr[0];
		
		System.out.println("Smallest number : "+smallstNum);


		

	}
	
	public static void main(String[] args) {
		int arr[] = {6,50,2,130,1};
		
		int smallstNum = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<smallstNum) {
				smallstNum=arr[i];
			}
		}
		System.out.println("Smallest number:"+smallstNum);
		
		
		
	}
	
	
}
