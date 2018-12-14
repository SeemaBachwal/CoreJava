package com.goddess.semifinal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CandidateCode {

	static List<List<Integer>> parent = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> child;
		int n = scanner.nextInt(); // 10
		int m = scanner.nextInt(); // 7
		int r = scanner.nextInt(); // 2
		int a = 0, b = 0;
		scanner.nextLine();
		while (m != 0) {
			String s = scanner.nextLine();
			String strArr[] = s.split(" ");
			child = new ArrayList<Integer>();
			if (strArr.length != 0) {
				child.add(Integer.valueOf(strArr[0]));
				child.add(Integer.valueOf(strArr[1]));
				parent.add(child);
			}
			m--;
		}
		// System.out.println(parent);
		// 1 9 2 3 10 3
		int l = scanner.nextInt();
		int arr[] = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(parent);
		
		
		// logic
		int p = 0, q = arr.length-1;
		/*while(p < q){
							
				ListIterator<List<Integer>> li = parent.listIterator(0);	
				
				if(li.hasNext()){
					for (Integer innerList : li.next()) {
						System.out.print(innerList+ " ");
						if(innerList.equals(arr[p]) || innerList.equals(arr[q])){
							
						}
					}
					System.out.println(li.next());
				}
				p++;
				//q--;
			
			
		}*/
		int pSize = parent.size();
		while(pSize != 0){
			ListIterator<List<Integer>> li = parent.listIterator();
				for (Integer innerList : li.next()) {
					System.out.print(innerList+ " ");
					/*if(innerList.equals(arr[p]) || innerList.equals(arr[q])){
						
					}*/
				}
			pSize--;
			//q--;
		}
		scanner.close();
	}
}