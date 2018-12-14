package com.collectionsdemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrintDuplicates {

	
	
	public static void main(String[] args) {

		String str = "I am learning java java java daily daily daily daily daily daily am also my java";
		String strArr[] = str.split("\\s");
		HashMap<String, Integer> hm = new HashMap();
		int maxCount;
		String maxAppearedString ="";
		for (String itr : strArr) {
			
			if (hm.containsKey(itr))
				hm.put(itr, hm.get(itr)+1);
			else
				hm.put(itr, 1);

			if (hm.get(itr) > 1) {
				maxCount = hm.get(itr);
				maxAppearedString = itr;
			}
		}
		System.out.println("Max appeared string is : "+maxAppearedString);
		//System.out.println(hm);
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		
		ConcurrentHashMap<Integer, String> curr = new ConcurrentHashMap<>();
		curr.put(101, "abc");
		curr.put(109, "xyz");
		curr.put(110, "pqr");
		curr.put(103, "def");
		curr.put(105, "mno");
		
		
		for (Map.Entry<Integer, String> map: curr.entrySet()) {
			System.out.println("Key "+map.getKey() + " and Value "+map.getValue());
		}
		
	}
}