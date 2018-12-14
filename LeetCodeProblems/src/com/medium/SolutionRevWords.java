package com.medium;


public class SolutionRevWords {
	
	public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i= strArr.length-1 ; i >= 0; i--)
        {
            sb.append(strArr[i]+" ");
            
        }
        return sb.toString().trim().replaceAll("\\s+", " ");
        
    }
	
	public static void main(String[] args) {
		
		//String s =  "the sky is blue";
		String s =  "  a  b  ";
		System.out.println("Before Rev : "+s);
		SolutionRevWords obj = new SolutionRevWords();
		String ans = obj.reverseWords(s);
		System.out.println("After Rev : "+ans);
	}

}
