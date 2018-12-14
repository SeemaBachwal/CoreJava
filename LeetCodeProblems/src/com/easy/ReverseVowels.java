package com.easy;

public class ReverseVowels {

	public String reverseVowels(String s) {
		char ch[] = s.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			if (isVowel(ch[j])) {
				if (isVowel(ch[i])) {
					char swap = ch[j];
					ch[j] = ch[i];
					ch[i] = swap;
					i++;
					j--;
				} else
					i++;
			} else
				j--;
		}
		return new String(ch);
	}

	public boolean isVowel(char c) {

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
		return false;

	}

	public static void main(String[] args) {

		ReverseVowels obj = new ReverseVowels();
		System.out.println(obj.reverseVowels("leetcode"));
	}

}
