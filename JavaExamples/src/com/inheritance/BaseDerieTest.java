package com.inheritance;

class Base{
	//String name  = "abc";
	String name ;
	
	public Base(String baseName) {
		System.out.println("Base constructor with name "+baseName);
		this.name = baseName;
	}


	public void add() {
		System.out.println("add of Base Class");
	}
	
}


class Derived extends Base{
	//String name = "xyz";
	String name ;
	
	public Derived(String derName) {
		super(derName);
		System.out.println("Detived constructor with name "+derName);
		name = derName;
	}

	public void subtract() {
		System.out.println("subtract of Derived");
	}
	
	public void add() {
		System.out.println("add of Derived Class");
	}
}
public class BaseDerieTest {

	public static void main(String[] args) {
	
		Base b = new Derived("ParentRef");
		//b.subtract(); // Compiler Error - method subtract not defined in Base Class
		System.out.println("using parent ref");
		b.add();
		Derived d = new Derived("DerivedObj");
		System.out.println("using derived obj");
		d.add();
		
		System.out.println("Accessing parent instance var name using parent ref "+b.name);
		System.out.println("Accessing parent instance var name using derived obj "+d.name);
		
		System.out.println("Again Accessing parent instance var name using parent ref "+b.name);
		
		Base newRef = new Derived("NewBaseRef");
		
		Derived d1 = new Derived("NewDerived");
		
		System.out.println("Accessing parent instance var name using parent ref "+newRef.name);
		System.out.println("Accessing parent instance var name using derived obj "+d1.name);
		
		System.out.println("Again Accessing parent instance var name using parent ref "+newRef.name);
		
	}
	
	
	
}
