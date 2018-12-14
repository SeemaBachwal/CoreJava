package com.algos;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static boolean binarySearch(List<Integer> nums, Integer value) {

		if (nums == null || nums.isEmpty()) {
			return false;
			}
		
		Integer midValue = nums.get(nums.size() / 2);
		
		if (midValue.equals(value))
			return true;

		if (value < midValue)
			return binarySearch(nums.subList(0, nums.size() / 2),
					value);
		else
			return binarySearch(
					nums.subList(nums.size() / 2 + 1, nums.size()),
					value);

	}

	public static void main(String[] args) {

		boolean ans = binarySearch(Arrays.asList(6, 4, 9, 5, 8, 2, 3, 7), Integer.valueOf(5));
		if (ans)
			System.out.println("Elemnet Found");
		else
			System.out.println("Not Found");
		
	}

}
