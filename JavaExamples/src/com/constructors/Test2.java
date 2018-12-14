package com.constructors;

class Test1 {    
    Test1(int x) { 
        System.out.println("Constructor called " + x); 
    }
   
} 
   
// This class contains an instance of Test1  
class Test2 {     
    Test1 t1 = new Test1(10);    
    
    /*public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
    public static void gfg(Integer i) 
    { 
        System.out.println("Integer"); 
    }
   */
    Test2(int i) { t1 = new Test1(i); }  
   
    public static void main(String[] args) {     
         Test2 t2 = new Test2(5); 
       //  gfg(null);
         
         
         /* the literal 08 of type int is out of range 
         short s = 0; 
         int x = 07; 
         int y = 08; 
         int z = 112345; 
   
         s += z; 
         System.out.println("" + x + y + s);*/ 
   
         int a = 024;
         System.out.println(a);
         System.out.println((010 == 8));
         System.out.println((024 == 20));
    } 
} 