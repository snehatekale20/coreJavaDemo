package com.demo.multithreadinDemo;

public class InterThreadComunication {
	
	int amount=1000;
	synchronized void withdraw(int amount) {
		
		System.out.println("withdrawing money : "+amount);
		if(this.amount < amount) {
			
			System.out.println("Insuffisient balance ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println("withdraw completed");
	}
	
	
	synchronized void deposite(int amount) {
		
		System.out.println("depositing money into account : "+amount);
		this.amount=this.amount+amount;
		System.out.println("deposit completed");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
	
	public static void main(String[] args) {
		InterThreadComunication obj = new InterThreadComunication();
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				obj.withdraw(1500);
			}
		};
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After main sleep");
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				obj.deposite(1000);
			}
		};
		Thread t2 = new Thread(r2);

		t2.start();
	}

}
