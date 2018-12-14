package com.overloading;

public class DemoClass {
	
	public void sum(int a, String abc) {
		
		System.out.println("sum with String as param");
	}
	
	public void sum(int a, Object abc) {
		
		System.out.println("sum with StringBuffer as param");
	}
	
	public int add(int... a) {
		System.out.println("int add called");
		int sum =0;
		for (int i : a) {
			sum = sum + i;
		}
		return sum;
	}

	public long add(long... a) {
		System.out.println("long add called");
		long sum =0;
		for (long i : a) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		DemoClass dc = new DemoClass();
		dc.sum(1, "abc");
		
		System.out.println("Addition value : "+dc.add(12, 14,15,16,18,19,300,200));
		
		System.out.println("Now called : "+dc.add(1200,234567, 34557678));
		
	}

}
