package com.polymorphism;

class Parent {

/*	public Parent() {
		System.out.println("Parent no-arg constructor");
	}
	*/
	public Parent(String name) {

		System.out.println("Parent parameterized-constructor for "+name);
	}

	public void show() {
		System.out.println("Parent show()");
	}

}

class Child extends Parent {

	public Child() {
		super("Jack");
		System.out.println("Child no-arg constructor");
	}
	
	public Child(String name) {	
		super(name);
		System.out.println("Child parameterized constructor with "+name);
	}

	public void show() {

		System.out.println("Child show()");
	}

}

public class ParentChildClass {

	public static void main(String[] args) {

//		Parent c1 = new Child("Jill");
//		c1.show();
	}

}
