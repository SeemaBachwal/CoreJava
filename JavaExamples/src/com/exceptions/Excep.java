package com.exceptions;

class Excep
{
 public static void main(String[] args)
 {
  /*try
  {
   int arr[]={1,2};
   arr[2]=3/0;
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
	  System.out.println("array index out of bound exception");
  }
  catch(ArithmeticException ae)
  {
   System.out.println("divide by zero");
  }*/
	 

	 /* Compiler Error - Unreachable catch block ArrayIndexOutOfBoundsException, 
	  * Exception is already handled by the superclass Exception
	  * 
	  * try
	  {
	   int arr[]={1,2};
	   arr[2]=3/0;
	  }
	  catch(Exception e)    //This block handles all Exception
	  {
	   System.out.println("Generic exception");
	  }
	  catch(ArrayIndexOutOfBoundsException e)    //This block is unreachable
	  {
	   System.out.println("array index out of bound exception");
	  }*/
	 
	 
	 
	 try
	  {
	   int arr[]={5,0,1,2};
	   try
	   {
	    int x=arr[3]/arr[1];
	   }
	   catch(ArithmeticException ae)
	   {
	    System.out.println("divide by zero");
	   }
	   arr[4]=3;
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	   System.out.println("array index out of bound exception");
	  }
	 
	 
 }
}
