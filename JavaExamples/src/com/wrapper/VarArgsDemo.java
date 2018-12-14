
package com.wrapper;

public class VarArgsDemo {
	
	public static void add(int... i){
		
		int sum = 0;
		for (int j : i) {
			sum = sum + j;	
		}
		
		System.out.println("Total Addition : "+sum);
	}
	
	
	public static String[] reverseWords(String s)
    {
        String[] sa = s.trim().split(" +");
        for (int i = 0; i < sa.length / 2; i++)
        {
            String temp = sa[i];
            sa[i] = sa[sa.length - i - 1];
            sa[sa.length - i - 1] = temp;
        }
        
        return sa;
    }
	
	public static void main(String[] args) {
		
		add(10,20,30,40,50);
		add(1,2,3,4,5);
		String ans[] = reverseWords("Hello World I am here");
		System.out.println(ans);
		System.out.println();
	}

}
