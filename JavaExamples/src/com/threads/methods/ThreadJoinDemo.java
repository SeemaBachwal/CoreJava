package com.threads.methods;


class JoinClass implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() +" started..");
	}
	
	

}

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread t0 = new Thread(new JoinClass(), "Thread 0");
		Thread t1 = new Thread(new JoinClass(), "Thraed 1");
		Thread t2 = new Thread(new JoinClass(), "Thraed 2");
		Thread t3 = new Thread(new JoinClass(), "Thraed 3");
		
		// started all threads
		t0.start();
		t1.start();
		
		t0.join();
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName()+" printing "+ i);
		}
		t1.join();
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+" printing "+ i);
		}
		
		t2.start();
		t2.join();
		for (int i = 0; i < 4; i++) {
			System.out.println(Thread.currentThread().getName()+" printing "+ i);
			
		}
		
		t3.start();
		t3.join();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" printing "+ i);
			
		}
		
	}
}
