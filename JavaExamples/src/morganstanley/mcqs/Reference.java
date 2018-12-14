package morganstanley.mcqs;

class Base{

	String var = "Java";
	void printVar(){
		System.out.println(var);
	}
	
}

class Derived extends Base{
	
	String var = "Test";
	void printVar(){
		System.out.println(var);
	}
	
}


public class Reference {
	
	public static void main(String[] args) {
		
		Base base = new Base();
		Base derived = new Derived();
		System.out.println(base.var);
		System.out.println(derived.var);
		base.printVar();
		derived.printVar();
	
		
	}

}

/*
 --- Output ---
Java
Java
Java
Test
*/

