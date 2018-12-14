package com.overloading;

import java.io.IOException;

public class GFFSamples {

/*	Example 1
 * Compiler Error
 
 * For method overloading, methods must have different signatures. 
 * Return type of methods does not contribute towards different method signature, 
 * so the code below give compilation error. Both getdata 1 and getdata 2 only differ 
 * in return types and NOT signatures.

 	public int getData() //getdata() 1
    {
        return 0;
    }
    public long getData() //getdata 2
    {
        return 1;
    }
    public static void main(String[] args)
    {
        GFFSamples obj = new GFFSamples();
        System.out.println(obj.getData());    
    }*/
	
	
/*	Example 2
 * Methods that throws different exceptions are not overloaded as their signature are still the same.
 * Below we have changed the method signature for second get() to check the flow
 * Works fine and prints 0
 
 	public int getData(String temp) throws IOException
    {
        return 0;
    }
    public int getData(String temp, String str) throws Exception
    {
        return 1;
    }
    public static void main(String[] args)
    {
        GFFSamples obj = new GFFSamples();
        try{
        	System.out.println(obj.getData("GFG"));	
        }
        catch(IOException ioe){
        	System.out.println("caught IOException");
        }
            
    }*/
	
	
/*	Example 3
 * Works fine and prints GFG 
 * Access modifiers associated with methods doesn’t determine the criteria for overloading. 
 * The overloaded methods could also be declared as final or static without affecting the 
 * overloading criteria.
 
 	private String function()
    {
        return ("GFG");
    }
    public final static String function(int data)
    {
        return ("GeeksforGeeks");
    }
    public static void main(String[] args)
    {
        GFFSamples obj = new GFFSamples();
        System.out.println(obj.function());
    }*/
	
	
}
