package com.strings;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
/*		String str = new String(new char[]{'a','b'});
		System.out.println();
		Integer i = 1;
		System.out.println(i+1);
		
		
		int Output = 10;
		boolean b1 = false;
		if((b1 == true) && ((Output += 10) == 20))
		{
		    System.out.println("We are equal " + Output);
		}
		else
		{
		    System.out.println("Not equal! " + Output);
		}  
		
		int var1 = 42;
		int var2 = ~var1;
		System.out.println("var 1 "+var1+" and var2 "+var2);*/
		
		String str = "abc";
		
		
		
		
		int sum = 0;
        for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
            sum += i;
        System.out.println(sum);
        
        List<Object> obj = new ArrayList<>();
        obj.add("abc");
        System.out.println(obj);
        
        
        int x, y = 1;
        x = 10;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);
		
	}
	
}
