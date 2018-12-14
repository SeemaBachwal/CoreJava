package com.threads.methods;

import java.util.Scanner;

class Processor{
	
	
	public void producer() throws InterruptedException{
	
		
		synchronized (this) {
			String name = Thread.currentThread().getName();
			System.out.println(name+" waiting to get notified");
			wait();
			System.out.println(name+" process resumed");
		}
		
	}
	
	
	public void consumer() throws InterruptedException{

		Scanner sc = new Scanner(System.in);
		
		Thread.sleep(2000);
		String name = Thread.currentThread().getName();
		System.out.println(name +" got the control");
		synchronized (this) {
			System.out.println("Press key to fininsh the task");
			sc.nextLine();
			System.out.println(name +" is notifying");
			notify();
			Thread.sleep(5000);
		}
		
		
	}
}


public class ThreadWaitNotifyDemo {

	public static void main(String[] args) throws InterruptedException {
		
		final Processor p = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					p.producer();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}, "producer");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					p.consumer();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}, "consumer");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
}
