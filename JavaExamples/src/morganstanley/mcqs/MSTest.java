package morganstanley.mcqs;

class Person{
	
	public String name;
	public int height;
}

public class MSTest {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "Java";
		anotherMethod(p);
		System.out.println(p.name);
		someMethod(p);
		System.out.println(p.name);
	}
	
	static void someMethod(Person p){
		p.name = "someMethod";
		System.out.println(p.name);
	}

	static void anotherMethod(Person p){
		p = new Person();
		p.name = "anotherMethod";
		System.out.println(p.name);
	}
}


/*
 --- Output --- 
anotherMethod
Java
someMethod
someMethod
*/
