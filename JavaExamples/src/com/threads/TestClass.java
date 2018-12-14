package com.threads;

public class TestClass {

	public static void main(String[] args) {

		ThreadDemo threaddemo = new ThreadDemo();
		System.out.println("Object State : " + threaddemo.getState());

		threaddemo.start();

		System.out.println("Object State after starting: "
				+ threaddemo.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Object State after starting: "
				+ threaddemo.getState());
		
		
		SampleClass sc = new SampleClass();

	}
}

class ThreadDemo extends Thread {

	public ThreadDemo() {
		System.out.println("In ThreadeDemo class constructor");
	}

	@Override
	public void run() {
		System.out.println("Thread Demo run method");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	
		
	}

}

class RunnableDemoClass implements Runnable {

	public RunnableDemoClass() {
		System.out.println("In RunnableDemoClass constructor");
	}

	@Override
	public void run() {
		System.out.println("Runnable Demo run method");

	}

}

class SampleClass {

	public SampleClass() {
		System.out.println("In sample class conmstructor");
	}
}
