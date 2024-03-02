package com.demo.concurentMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecutor {

	public static void main(String[] args) {
		
          Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("this is my first thread : 1");
			
				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is my second thread : 2");
				
			}
		};
		
		//it will create as many as thread it need for execution 
		ExecutorService service3 = Executors.newCachedThreadPool();
		service3.execute(r1);
		service3.execute(r2);
		
		
		service3.shutdown();
	}
}
