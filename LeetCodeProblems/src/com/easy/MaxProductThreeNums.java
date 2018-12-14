package com.easy;

import java.util.Arrays;

public class MaxProductThreeNums {

	public int maximumProduct(int[] nums) {
		
		Arrays.sort(nums);
		int count = 1;
		int prod = 1;
		int j = 0;
		for (int i = nums.length-1; i >= 0 ; i--) {
			if(count < 4){
				if(nums[i] < 0){
					prod *= nums[j];
					j++;
				}
				else
					prod *= nums[i];
				
				count++;
			}
		}
		return prod;

	}

	public static void main(String[] args) {
		
		// int nums[] = {4,8,3,6,2,10,7};
		//int nums[] = {-4,-3,-2,-1,60};
		int nums[] = {-4,-1,-60,10,5};
		
		// sort
		// -4,-3,-2,-1,60
		
		
		MaxProductThreeNums m = new MaxProductThreeNums();
		System.out.println(m.maximumProduct(nums));
		
	}
}
