package com.arrays;

public class Test 
{ 
	int x = 10;
	
	static int a = 98;
	public static void testMethod( ) {
		System.out.println("Static var "+a);
		//System.out.println("Instan var "+x);
	}
	public void assign(int x) {
		x = x;
		System.out.println("value of x "+this.x);
		System.out.println("value of a "+a);
	}
  public static void main(String argv[])
   {
	  
	  Test t1 = new Test(), t2 = new Test();
	  new Test().assign(100);
     /*int[] arr = new int[]{1,2,3};
     System.out.println(arr[1]);*/
	  
	  int j = 5;
	  for (int i = 0; i< j; i++)
	  {
	    if ( i <= j-- ){
	    	int ans =  i*j;
	    	System.out.print(ans);
	    }
	       
	  } 
	  
	  /*double d = 100.04;  
	    float f = d;	
	    System.out.println("Float value "+f);*/
	  
		System.out.println(3<<2);
		System.out.println(3>>1);
		char c ='\uface';
   } 
}
