package morganstanley.mcqs;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		Set<Foo> myFooSet = new HashSet<Foo>();
		myFooSet.add(new Foo(2));
		myFooSet.add(new Foo(1));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(3));
		myFooSet.add(new Foo(2));
		System.out.println("Size : "+myFooSet.size());
	}

}

class Foo{
	Integer code;
	
	Foo(Integer c) {
		code = c;
	}
	
	public boolean equals(Object f) {
		return true;
	}
	public int hashCode(){
		return 17;
	}
}