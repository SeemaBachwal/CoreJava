package com.easy;

public class SolutionRemoveElement {

	public int removeElement(int[] nums, int val) {

		if(nums.length == 0)
			return 0;
		
		int count=0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				count++;
			}
		}

		
		return count;
	}

	public static void main(String[] args) {

		//int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int nums[] = {3,2,2,3};
		SolutionRemoveElement obj = new SolutionRemoveElement();
		System.out.println(obj.removeElement(nums, 3));
	}
}
