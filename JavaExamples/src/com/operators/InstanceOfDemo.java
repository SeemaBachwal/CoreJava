package com.operators;
class Subject
{
    void methodOfSubject()
    {
        System.out.println("From Subject");
    }
}
 
class Physics extends Subject
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Physics");
    }
}
 
class Biology extends Subject
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Biology");
    }
}
 
class Botany extends Biology
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Botany");
    }
}
 
class Zoology extends Biology
{
    @Override
    void methodOfSubject()
    {
        System.out.println("From Zoology");
    }
}

public class InstanceOfDemo {

	/* public static void main(String[] args)
	    {
	        //An array of Subjects
	        Subject[] subjects = {new Biology(), new Botany(), new Zoology(), new Subject(), new Physics()};
	 
	        for (int i = 0; i < subjects.length; i++)
	        {
	            Biology biology = (Biology) subjects[i];
	 
	            biology.methodOfSubject();
	        }
	    }*/
	
	 public static void main(String[] args)
	    {
	        //An array of Subjects
	        Subject[] subjects = {new Biology(), new Botany(), new Zoology(), new Subject(), new Physics()};
	 
	        for (int i = 0; i < subjects.length; i++)
	        {
	            //Checking whether the object is a type of Biology using instanceof operator
	            if(subjects[i] instanceof Biology)
	            {
	                subjects[i].methodOfSubject();
	            }
	        }
	    }
	
}
