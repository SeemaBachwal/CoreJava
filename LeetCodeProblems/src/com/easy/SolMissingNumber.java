package com.easy;

import java.util.Arrays;

public class SolMissingNumber {

	public int missingNumber(int[] nums) {
     
		Arrays.sort(nums);
		int counter = 0 ;
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] != i)
				return i;
			else
				counter++;
			
		}
		return counter;
    }
	
	public static void main(String[] args) {
		
		//int nums[] = {3,0,1}; // sort : 0 1 3
		//int nums[] = {9,6,4,2,3,5,7,0,1};
		int nums[] = {0};
		//int nums[] = {0,1,2,3,4};
		int ans = new SolMissingNumber().missingNumber(nums);
		System.out.println(ans);
		
	}
}
