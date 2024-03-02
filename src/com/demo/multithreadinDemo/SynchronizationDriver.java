package com.demo.multithreadinDemo;

public class SynchronizationDriver {

	public static void main(String[] args) {
		
		ThreadSynchronization obj = new ThreadSynchronization();
		MyThread4 t4 = new MyThread4(obj);
		t4.setPriority(Thread.MIN_PRIORITY);
		t4.start();
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				obj.printNumber(10);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				obj.printNumber(20);
				
			}
		};
		Thread t2 = new Thread(r2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		Runnable r3 = new Runnable() {
			
			@Override
			public void run() {
				
				obj.printNumber(15);
			}
		};
		Thread t3 = new Thread(r3);
		t3.start();
	
	}

}
