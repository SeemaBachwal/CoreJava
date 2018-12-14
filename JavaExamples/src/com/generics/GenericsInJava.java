package com.generics;

class GenericClass<T> {
	T t;

	public GenericClass(T t) {
		this.t = t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}

public class GenericsInJava {

	public static void main(String[] args) {

		GenericClass<String> gen1 = new GenericClass<String>(
				"It must be string");

		gen1.setT("Value Changed"); // Passing String to setT() method

		String s = gen1.getT(); // getT() method returning string

		// gen1.setT(new Integer(123)); //Compile time error. You can't pass
		// Integer type to setT() method now

		// gen1.setT(new Double(23.56)); //Compile time error. You can't pass
		// Double type to setT() method now

		GenericClass<Integer> gen2 = new GenericClass<Integer>(new Integer(123));

		gen2.setT(456); // Passing Integer type to setT() method

		Integer I = gen2.getT(); // getT() method returning Integer type

		// gen2.setT(new String("123")); //Compile time error. You can't pass
		// String type to setT() method now

		// gen2.setT(new Double(23.56)); //Compile time error. You can't pass
		// Double type to setT() method now
	}

}
