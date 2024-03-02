package com.demo.multithreadinDemo;

public class ThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=20;i++) {
			System.out.println("thead 1 "+i);
		}
	}
	

}
