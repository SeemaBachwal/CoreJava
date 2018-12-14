package com.exceptions;

class ReturnTryCatchFinally {

	public String test() {
		
		try
		{
			int a = 10/0;
			System.out.println("returning from try block");
			return "From Try";
		}
		catch(Exception e){
			System.out.println("returning from catch block");
			return "From Catch";
		}
		finally{
			System.out.println("returning from finally block");
			return "From Finally";
		}
		
	}
}

public class ReturnTCF {

	public static void main(String[] args) {

		ReturnTryCatchFinally testObj = new ReturnTryCatchFinally();
		System.out.println("Return  : "+testObj.test());
	}

}
