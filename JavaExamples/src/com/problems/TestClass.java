package com.problems;

public class TestClass {

	
	public static void main(String[] args) {
		
		{
			int x = 5;
			{
				x = 10;
				System.out.println(x);
			}
			int g = 3;
            System.out.print(++g * 8);
            System.out.println();
            int array_variable [] = new int[10];
    	    for (int i = 0; i < 10; ++i) {
                    array_variable[i] = i;
                    System.out.print(array_variable[i] + " ");
                    i++;
                }
            
		}
		
	}
}
