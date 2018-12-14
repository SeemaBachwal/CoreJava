package com.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		// simple solution to remove duplicates
		Set<Integer> hs = new HashSet<>(arr);
		System.out.println(hs);
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(9, "value9");
		map.put(3, "value3");
		map.put(1, "value1");
		map.put(9, "newVal9");
		map.put(4, "value4");
		map.put(6, "value6");
		map.put(5, "value5");
		map.put(8, "value8");
		map.put(11, "value11");
		map.put(null, "NullKey1");
		map.put(null, "NullKey2");
		
		System.out.println(map);
		
		HashSet<Integer> set = new HashSet<>();
		
		
		
	}
	
}
