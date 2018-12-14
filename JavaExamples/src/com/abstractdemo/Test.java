package com.abstractdemo;

class A{
	
	void show(){
		System.out.println("in class A show()");
	}
	
}
abstract class B extends A{
	
	public B() {
		System.out.println("B constrcutor call");
	}
	
	/*void show(){
		System.out.println("in class B show()");
	}*/
	
}

class C extends B{
	
	public C() {
		System.out.println("C constrcutor call");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		A a = new A();
		A aref = new B() {
			void show (){
				System.out.println("In anonymous show method");
			}
		};
		B bref = new C();
		C c = new C();
		c.show();
		/*if(a instanceof A)
			System.out.println("True : a instanceof A");
		
		
		if(bref instanceof B)
			System.out.println("True : bref instanceof B");
		else
			System.out.println("False : bref is not an instanceof B");*/
		
	}
	
}


