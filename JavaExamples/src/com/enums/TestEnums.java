package com.enums;

class Wrapper{
	
	enum Fruits{
		GRAPES, MANGO, APPLE, BANANA,GUAVA,PINEAPPLE
	}
}


public class TestEnums {

	// Accessing enum declared in other class
	
	private Wrapper.Fruits myfruits;
	
	public TestEnums(Wrapper.Fruits myfruits) {
		
		this.myfruits = myfruits;
	}
	
	public void getEnums(){
		switch (myfruits) {
		case GRAPES:
			System.out.println("Found Grapes");
			break;
		case GUAVA:
			System.out.println("Found Guava");
			break;
		case APPLE:
			System.out.println("Found Apple");
			break;
		case BANANA:
			System.out.println("Found Banana");
			break;
		default:
			System.out.println("No Fruits found here ..!!");
			break;
		}
		
	}
	
	public static void main(String[] args) {
	
		TestEnums t1 = new TestEnums(Wrapper.Fruits.BANANA);
		t1.getEnums();
		TestEnums t2 = new TestEnums(Wrapper.Fruits.GUAVA);
		t2.getEnums();
		TestEnums t3 = new TestEnums(Wrapper.Fruits.PINEAPPLE);
		t3.getEnums();
		
	}
	
	
	
}
