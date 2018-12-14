package com.problems;

import java.util.HashMap;
import java.util.Map;

class SolutionME {
	
    public int majorityElement(int[] nums) {
    	Map<Integer, Integer>  map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if(!map.containsKey(nums[i]))
    			map.put(nums[i], 1);
    		else
    			map.put(nums[i], (map.get(nums[i]))+1);
		}

    	int majorElem = 0;
    	for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
    		if(mapEntry.getValue() > nums.length/2)
    			majorElem = mapEntry.getKey();
		}
    	return majorElem;
    	
    	// Alternate Solution
    	/*int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;*/
    	
    	
    }
}

public class MajortiyElement {

	public static void main(String[] args) {
		
		int []nums = {3,2,3};
		System.out.println(new SolutionME().majorityElement(nums));	
	}
}

