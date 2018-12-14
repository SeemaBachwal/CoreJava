package com.easy;

import java.util.LinkedList;

public class FirstNonrepeatingChar {

	LinkedList<Character> list = new LinkedList<>();
	public int firstUniqChar(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (!list.contains(s.charAt(i)))
				list.add(s.charAt(i));
			else
				list.removeFirstOccurrence(s.charAt(i));
		}
		
		if(list.isEmpty())
			return -1;
		else
			return s.indexOf(list.getFirst());

	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(new FirstNonrepeatingChar().firstUniqChar(s));
	}

}
