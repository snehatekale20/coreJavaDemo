package com.demo.concurentMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutor {

	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("this is my first thread : 1");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is my second thread : 2");
				
			}
		};
		
		
		//it will create thread pool of number we passed here
		//it execute threads parallel
		ExecutorService service2 = Executors.newFixedThreadPool(2);
		service2.execute(r1);
		service2.execute(r2);
		
		service2.shutdown();
	}
}
