package com.inheritance;

class Animal {
	String name = "animal";

	String makeNoise() {
		return "generic noise";
	}

	public void callprivate() {
		show();
	}

	private void show() {

		System.out.println("show method of Animal");

	}

	// public void m1(){}
}

class Dog extends Animal {
	String name = "dog";

	String makeNoise() {
		return "bark";
	}

	// void m1(){} - cannot be more restrictive than super class method

	static public void show() {

		System.out.println("show method of Dog");

	}
}

public class Test {
	private String function() {
		return ("GFG");
	}

	public final static String function(int data) {
		return ("GeeksforGeeks");
	}

	public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
/*	public static void gfg(Integer i) 
    {     
        System.out.println("Integer"); 
    }*/ 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
	
	
	public static void main(String[] args) {
		
		/* Access modifiers associated with methods doesn’t determine the criteria for overloading. 
		 * The overloaded methods could also be declared as final or static without affecting 
		 * the overloading criteria. */
		Test obj = new Test();
		System.out.println(obj.function());

		gfg(null); 
		

		// Inheritance test cases
		
		Animal an = new Dog();
		System.out.println(an.name + " " + an.makeNoise());

		Dog.show();

		Animal a = new Animal();
		a.callprivate();
	}
}