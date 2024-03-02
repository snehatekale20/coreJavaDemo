package com.demo.multithreadinDemo;

public class ThreadSynchronization {
	
	
	 void printNumber(int n) {
		 
		System.out.println(Thread.currentThread().getName());
		
		synchronized (this) {
			for(int i=1;i<=n;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
		
		
	}

}
