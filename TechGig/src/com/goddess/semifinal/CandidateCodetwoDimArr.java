package com.goddess.semifinal;

import java.util.Scanner;

public class CandidateCodetwoDimArr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 10
		int m = scanner.nextInt(); // 7
		int r = scanner.nextInt(); // 2
		int row = m, col = r;
		int data[][] = new int[row][col];

		// input pairs
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = scanner.nextInt();
			}
		}
		
		// input symphony - 1 9 2 3 10 3
		int l = scanner.nextInt();
		int arr[] = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// display pairs
		System.out.println("--- Display Pairs ---");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(data[i][j]+ " ");
			}
		}
		
		System.out.println("\n");
		// display symphony
		System.out.println("--- Display Symphony ---");
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
