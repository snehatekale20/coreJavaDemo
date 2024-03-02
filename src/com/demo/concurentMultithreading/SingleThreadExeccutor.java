package com.demo.concurentMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExeccutor {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("this is my thread : 1");
				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is my second thread : 2");
				
			}
		};
		
		//this is our prevoius way to create thread
		//Thread t1 = new Thread(r1);
		//t1.start();
		
		//in executor we create thread like following instead of creating thread object
		//and it take single thread at a time
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		service.execute(r1);   //this method execute thread
		service.execute(r2);
		
		service.submit(r2);   //we can use submit also to execute but this submit method just submit thread and we dont know when it will execute
		
		service.shutdown(); //it terminate all thread after execution and after that it does not allow new thread
		
	}
	
}
