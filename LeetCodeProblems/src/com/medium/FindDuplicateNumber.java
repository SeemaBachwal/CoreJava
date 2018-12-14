package com.medium;

import java.util.Arrays;

public class FindDuplicateNumber {

	public int findDuplicate(int[] nums) {

		if (nums == null || nums.length == 0)
			return -1;
		
		if(nums.length ==1 && nums[0] > 0)
			return -1;

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return nums[i];
		}
		return nums[nums.length - 1];
	}

	public static void main(String[] args) {

		int nums[] = { 3, 1, 2, 4, 4 };
		int ans = new FindDuplicateNumber().findDuplicate(nums);
		System.out.println(ans);
	}

}
