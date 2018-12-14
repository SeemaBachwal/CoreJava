package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDisappearedNumbers {

	List<Integer> arrList = new ArrayList<>();

	public List<Integer> findDisappearedNumbers(int[] nums) {
		
		Arrays.sort(nums);
		int j = 1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == j)
				++j;
			else{
				if(nums[i] < j){
					arrList.add(i+1);
				}
				else{
					arrList.add(j);
					++j;
				}
			}
		}
		return arrList;
    }

	public static void main(String[] args) {

		//int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int nums[] ={2,2};
		System.out.println(new FindDisappearedNumbers().findDisappearedNumbers(nums));
	}
}
