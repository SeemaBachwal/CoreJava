package com.easy;

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {

		int i = 0, j = 0;
		boolean flag = false;

		if((s.length() == 0 && t.length() == 0) || (s.length() == 1 && t.length() == 1))
			return true;
		
		while (i < s.length()-1 && j < t.length()-1) {
			if (s.charAt(i + 1) != s.charAt(i)) {
				if (t.charAt(j + 1) != t.charAt(j)) {
					flag = true;
					i++;
					j++;
				} else{
					flag = false;
					break;
				}
					
			} else {
				if (t.charAt(j + 1) == t.charAt(j)) {
					flag = true;
					i++;
					j++;
				} else{
					flag = false;
					break;
				}
					
			}
		}

		return flag;
	}

	public static void main(String[] args) {

		IsomorphicStrings obj = new IsomorphicStrings();
		if (obj.isIsomorphic("a", "a"))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
