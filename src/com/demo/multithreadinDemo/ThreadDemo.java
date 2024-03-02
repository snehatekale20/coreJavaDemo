package com.demo.multithreadinDemo;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ThreadDemo obj = new ThreadDemo();
		ThreadUsingRunnable obj1 = new ThreadUsingRunnable();
		Thread t1 = new Thread(obj1);
		System.out.println("t1 state : "+t1.getState());
		System.out.println("t1 name is " +t1.getName());
		t1.setName("firstThread");
		t1.start();
		System.out.println("t1 state : "+t1.getState());
		System.out.println("t1 name is " +t1.getName());
		System.out.println("priority of t1 is : "+t1.getPriority());

		//t1.run();
		ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();
		System.out.println("t2 name is " +t2.getName());

		//t2.start();
		//obj2.run();
		if(t2.isDaemon()) {
			System.out.println("t2 thread is demon");
		}else {
			System.out.println("t2 is not demon");
		}
		System.out.println("insuide main");
		Runnable r = new Runnable() {
			
			@Override
			public void run() {

				for(int i=201;i<=300;i++) {
					System.out.println("theard 3 : "+i);
				}
			}
			
		};
		Thread t3 = new Thread(r);
		System.out.println(t3.getState());
		t3.start();
		try {
			Thread.sleep(20000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(t3.getState());
	}
}
