package com.demo.multithreadinDemo;

public class MyThread4 extends Thread {

	ThreadSynchronization obj;

	public MyThread4(ThreadSynchronization obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.printNumber(5);
	}
	
	
}
