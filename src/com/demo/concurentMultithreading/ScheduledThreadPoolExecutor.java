package com.demo.concurentMultithreading;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor {

	
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
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("this is my second thread : 2");
					
				}
			};
			
			//here we can schedule our threads execution
			//it is child of ExecutorService
			ScheduledExecutorService  service4 =Executors.newScheduledThreadPool(2);
			
			//it delays thread execution start by 5 seconds
			service4.execute(r1);

			//it starts execution after 5 seconds and then it execute continuesly for every 10 seconds
			//service4.scheduleAtFixedRate(r2, 5, 10, TimeUnit.SECONDS);
			
			
			//service4.shutdown(); // we can use this for shutdown
			
			//we can use this method also to stop thread execution immidiatly but this method return the thread which are not executed
			//List<Runnable>  l = service4.shutdownNow();
			//System.out.println(l.size());
			
			
			//as we know this method terminate execution of thread and do not accept new thread
			service4.shutdown();
			service4.execute(r2);
                       
			//but by usimg awaitTermination it will wait for 5 seconds if any new thread comes it execute
			
			  try {
				  service4.awaitTermination (5, TimeUnit.SECONDS); 
				  
			  } catch (InterruptedException e) {
				  e.printStackTrace(); 
				  
			  }
			 
	
	
	
	
	
	
	}
}
