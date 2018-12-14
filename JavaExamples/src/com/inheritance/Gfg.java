package com.inheritance;


class Person  
{  
    private void who() 
    { 
        System.out.println("Inside private method Person(who)"); 
    } 
   
    public static void whoAmI() 
    { 
        System.out.println("Inside static method, Person(whoAmI)"); 
    } 
   
    public void whoAreYou() 
    { 
        who(); 
        System.out.println("Inside virtual method, Person(whoAreYou)"); 
    } 
} 
  
class Kid extends Person 
{  
    private void who() 
    { 
        System.out.println("Kid(who)"); 
    } 
   
    public static void whoAmI() 
    { 
        System.out.println("Kid(whoAmI)"); 
    } 
   
    public void whoAreYou() 
    { 
        who(); 
        System.out.println("Kid(whoAreYou)"); 
    } 
} 
public class Gfg 
{ 
	// constructor 
    Gfg() 
    { 
        System.out.println("Geeksforgeeks"); 
    } 
      
    static Gfg a = new Gfg(); //line 8
    // Gfg a = new Gfg(); //line 8 - this line without static keyword gives stack overflow
	
	private void testPrivate() 
    { 
        System.out.println("Test private method access"); 
    } 
	
    public static void main(String args[])  
    { 
    	/*Gfg g = new Gfg();
    	g.testPrivate();*/
    			
    	 Gfg b; //line 12 
         b = new Gfg();
    	
        /*Person p = new Kid();   
        p.whoAmI();
        p.whoAreYou();*/
    } 
}