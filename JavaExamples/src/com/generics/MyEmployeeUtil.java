package com.generics;

public class MyEmployeeUtil<T extends Emp> {

	private T empObj;
	
	public MyEmployeeUtil(T obj) {
		this.empObj = obj;
	}
	
	public static void main(String[] args) {
		
	}
	
}
