package com.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static List<Integer> quickSort(List<Integer> nums) {

		if (nums.size() < 2) {
			return nums;
			}
		
		Integer pivotElem = nums.get(0);
		List<Integer> lower = new ArrayList<>();
		List<Integer> higher = new ArrayList<>();

		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i) < pivotElem)
				lower.add(nums.get(i));
			else
				higher.add(nums.get(i));

		}

		List<Integer> sortedList = quickSort(lower);
		sortedList.add(pivotElem);
		sortedList.addAll(quickSort(higher));
		
		return sortedList;
		
		
	}

	public static void main(String[] args) {

		List<Integer> ansList = quickSort(Arrays.asList(6, 4, 9, 5, 8, 2, 3, 7));
		System.out.println("Sorted Array : ");
		for (Integer print : ansList) {
			System.out.println(print + " ");
		}
		
	}
}
