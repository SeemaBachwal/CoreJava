package com.threads;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Started executing thread "
				+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doProcessHere();
		} catch (InterruptedException ie) {

			ie.printStackTrace();
		}
		System.out.println("Ended executing thread "
				+ Thread.currentThread().getName());
	}

	public static void doProcessHere() throws InterruptedException {

		System.out.println("In doProcessor method");
		
	}

	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableDemo());
		t1.start();
		
	}
	
}
