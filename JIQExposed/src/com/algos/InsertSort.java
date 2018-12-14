package com.algos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertSort {

	public static List<Integer> insertSort(List<Integer> nums) {

		final List<Integer> sortedList = new LinkedList<>();
		originalList: for (Integer number : nums) {
			for (int i = 0; i < sortedList.size(); i++) {
				if (number < sortedList.get(i)) {
					sortedList.add(i, number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}
		return sortedList;

	}

	public static void main(String[] args) {

		List<Integer> ansList = insertSort(Arrays.asList(6, 4, 9, 5, 8, 2, 3, 7));
		System.out.println("Sorted Array : ");
		for (Integer print : ansList) {
			System.out.println(print + " ");
		}

	}

}
