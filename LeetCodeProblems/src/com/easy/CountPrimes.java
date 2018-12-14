package com.easy;

public class CountPrimes {

	public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i < n; i++){
             boolean flag = isPrime(i);
              if(flag == true){
                  count=count+1;
                  continue;
              }                  
        }      
        return count++;
    }
    
    public static boolean isPrime(int n) {
        	
         for(int j = 2; j < n; j++){
            if(n % j == 0)
              return false;           
         }        
        return true;        
    }
    
    public static void main(String[] args) {
		int n = 20;
    	CountPrimes obj = new CountPrimes();
    	System.out.println(obj.countPrimes(n));
	}
	
}
