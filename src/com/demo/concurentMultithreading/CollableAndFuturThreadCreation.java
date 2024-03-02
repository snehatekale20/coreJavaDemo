package com.demo.concurentMultithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class CollableAndFuturThreadCreation {
	
	
	public static void main(String[] args) {
		
		Callable<String> c = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				System.out.println("this is callable thread");
				return "this is callable";
			}
		};
		
		ScheduledExecutorService service5 = Executors.newScheduledThreadPool(2);
		Future<String> f = service5.submit(c);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		if(f.isDone()) {
		try {
			 String s = f.get();
			 System.out.println(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		}
		service5.shutdown();
		
	}

}
