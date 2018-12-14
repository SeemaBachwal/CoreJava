package com.goddess.screening;

import java.util.Scanner;
public class CandidateCode {
 
	
	static int costOfInsertions(char str[], int l, int h) {
		
		if (l > h)
			return Integer.MAX_VALUE;
		if (l == h)
			return 0;
		if (l == h - 1)
			return (str[l] == str[h]) ? 0 : 1;
		
		return (str[l] == str[h]) ? costOfInsertions(str, l + 1, h - 1)
				: (Math.min(costOfInsertions(str, l, h - 1),
						costOfInsertions(str, l + 1, h)) + 1);
	} 
	
    public static void main(String args[] ) throws Exception {
    	
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	String str = scanner.next();
    	System.out.println(costOfInsertions(str.toCharArray(), 
                0, str.length()-1));
   }
}
