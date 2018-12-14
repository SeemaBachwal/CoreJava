package morganstanley.mcqs;

public class JavaTest {

	void foo(){
		
		try{
			String s = null;
			System.out.println("First");
			try{
				System.out.println(s.length());
			}catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("Exception 1");
			}
			System.out.println("Second");
		}catch(NullPointerException np){
			System.out.println("Exception 2");
		}
	}
	
	public static void main(String... args) {
		JavaTest obj = new JavaTest();
		obj.foo();
	}
	
}

/*
 --- Output ---
First
Exception 2
*/