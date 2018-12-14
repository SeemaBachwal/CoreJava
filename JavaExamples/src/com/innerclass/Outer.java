package com.innerclass;

interface Anonymous 
{ 
    public int getValue(); 
    public int getData(); 
} 
public class Outer  
{ 
    private int data = 15; 
    public static void main(String[] args) 
    { 
    	
    	Integer a = null;
    	System.out.println(a);
        Anonymous inner = new Anonymous() 
                { 
                    int data = 5; 
                    public int getValue() 
                    { 
                        return data; 
                    } 
                    public int getData() 
                    { 
                        return data; 
                    } 
                }; 
        Outer outer = new Outer(); 
        System.out.println(inner.getValue() + inner.getData() + outer.data); 
    } 
} 