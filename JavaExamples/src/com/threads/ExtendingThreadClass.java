package com.threads;

public class ExtendingThreadClass extends Thread{
	
	public ExtendingThreadClass(String name) {		
		super(name);
	}
	

	@Override
	public void run() {
		
		System.out.println("Thread Extending Demo started "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread Extending Demo stopped "+Thread.currentThread().getName());
		
		try {
			this.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getState());
	}
	
	
	public static void main(String[] args) {
		
		ExtendingThreadClass ext = new ExtendingThreadClass("MyThread");
		ext.start();
		
		
	}
	
}
