package com.algos;

public class BuubleSort {

	public static int[] bubbleSort(int sortArr[]) {
		boolean numberSwapped;

		do {

			numberSwapped = false;
			for (int i = 0; i < sortArr.length - 1; i++) {

				if (sortArr[i + 1] < sortArr[i]) {
					int temp = sortArr[i + 1];
					sortArr[i + 1] = sortArr[i];
					sortArr[i] = temp;
					numberSwapped = true;
				}

			}

		} while (numberSwapped);

		return sortArr;

	}

	public static void main(String[] args) {

		int[] arr = { 6, 4, 9, 5 };
		bubbleSort(arr);
		System.out.println("Sorted Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
