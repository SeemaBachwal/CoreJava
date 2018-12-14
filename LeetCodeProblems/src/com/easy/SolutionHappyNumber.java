package com.easy;

public class SolutionHappyNumber {

	
	// n = 19 = 1*1 + 9*9 = 82 again 8*8 + 2*2 = 68
    public boolean isHappy(int n) {
    	
    	if(n==1)
    		return true;
    	
        if(n==0 || n < 10)
        	return false;
    	
    	int squareSum = 0;
    	int num=0;
    	while(n!=0){
    		num = n % 10;
    		squareSum += num * num;
    		n = n /10;
    	}
    	if(squareSum == 1)
    		return true;
    	else
    		return isHappy(squareSum);
    	
    }
    
    public static void main(String[] args) {
    	
    	SolutionHappyNumber obj = new SolutionHappyNumber();
    	int n = 36;
    	if(obj.isHappy(n))
    		System.out.println(n +" is happy number");
    	else
    		System.out.println(n +" is sad number");		
	}
}
