package com.threads.synchronization;

class SynMethodClass implements Runnable
{
	
	/*public static synchronized int getValue(int i) {
		
		System.out.println(Thread.currentThread().getName()+ " have entered getVal()");
		return i;
	}*/

	
	/*public synchronized int getValue(int i) {
		
		System.out.println(Thread.currentThread().getName()+ " have entered getVal()");
		return i;
	}*/
	
	public int getValue(int i) {
		System.out.println(Thread.currentThread().getName()+ " entered getVal()");
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+" in syn block");
			return i;	
		}
		
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " started ...");
		getValue(5);
	}
	
}

public class SynMethod {

	public static void main(String[] args) {
	
		Thread t0 = new Thread(new SynMethodClass(), "Thread 0");
		Thread t1 = new Thread(new SynMethodClass(), "Thraed 1");
		Thread t2 = new Thread(new SynMethodClass(), "Thraed 2");
		Thread t3 = new Thread(new SynMethodClass(), "Thraed 3");
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		//System.exit(0);
		
	}
	
	
}
