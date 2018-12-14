package com.interfacedemo;

public class TestImpl implements Test {

	public TestImpl() {
		
		try{
			//int a = 10/0;
			throw new Exception();
		}catch(Exception e){
			System.out.println("Constructor can throw exception");
		}
		
		
	}
	@Override
	public void foo() {
		System.out.println("Implemented foo()");
	}

	public static void main(String[] args) {

		Test t1 = new TestImpl();
		t1.foo();
	}
}
