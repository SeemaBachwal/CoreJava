package morganstanley.mcqs;

public class JavaString {
	
	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		
		do{
			System.out.println(s1.equals(s2));
		}while(s3 == s4);
	}

}

/*
--- Output ---
True
True
True
.
.
.

True printed in infinite loop
*/