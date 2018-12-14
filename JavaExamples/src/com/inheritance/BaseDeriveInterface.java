package com.inheritance;

// interface
interface InheritanceTest {

	void show();

	int a = 10;

}

// Parent class implements interface
class BaseClass implements InheritanceTest {

	@Override
	public void show() {
		System.out.println("show() of BaseClass");
	}
	
	private void display(){
		System.out.println("display of BaseClass");
	}
}

// Child class
class DerivedClass extends BaseClass {

	void display(){
		System.out.println("display of DerivedClass");
	}
}

public class BaseDeriveInterface {

	public static void main(String[] args) {

		BaseClass baseref = new DerivedClass();
		baseref.show();
		System.out.println(baseref.a);

		DerivedClass der = new DerivedClass();
		der.show();
		der.display();
		System.out.println(der.a);
	}
}
