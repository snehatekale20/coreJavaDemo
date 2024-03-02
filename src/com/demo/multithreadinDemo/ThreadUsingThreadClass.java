package com.demo.multithreadinDemo;

public class ThreadUsingThreadClass extends Thread{
	
	public void run(){
		
		for(int i=1;i<=10;i++) {
			System.out.println("thead 2: "+i);
		}
		
	}

}
