package com.medium;

public class SingleElement {

	 public int singleNonDuplicate(int[] nums) {
		 
		 if(nums == null || nums.length == 0)
			 return 0;
		 
		 for (int i = 0; i < nums.length-1; i=i+2) {
			
			 if(nums[i] != nums[i+1])
				 return nums[i];
			 
			 //a = a ^ nums[i];
		} 
		 return nums[nums.length-1];
	    }
	 
	 public static void main(String[] args) {
		
		 //int nums[] = {1,1,2,2,3,3,4,4,8,};
		 //int nums[] = {1,1,2,3,3,4,4,8,8};
		 int nums[] ={3,3,7,7,10,11,11};
		 //int nums[] = {};
		 int ans = new SingleElement().singleNonDuplicate(nums);
		 System.out.println(ans);
	}
}
