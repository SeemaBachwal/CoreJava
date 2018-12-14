package morganstanley.mcqs;


class BaseClass{
	
	int a;
	BaseClass(int a) {
		System.out.println("Base Class Constructor Called");
		this.a = a;
	}
	
	
}

class DerivedClass extends BaseClass{
	
	public DerivedClass() {
		super(10); //explicitly invoking base class parameterized constructor will work
		System.out.println("Derived Class Constructor Called");
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		DerivedClass d = new DerivedClass();
		
	}

}

/*
 * The above code will give compilation error, because,
 * Base has parameterized constructor and Derived has a default constructor 
 * the implicit super constructor BaseClass() is undefined
 */
