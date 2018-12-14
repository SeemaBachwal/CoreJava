package com.easy;

public class NumberComplement {

	public int findComplement(int num) {

		if(num == 0)
			return 1;
		
		int i = 0;
		int nums[] = new int[32];
		while (num != 0) {
			nums[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			if (nums[j] == 0)
				nums[j] = 1;
			else if (nums[j] == 1)
				nums[j] = 0;
		}

		return bintoDecimal(nums, i);
	}

	public static int bintoDecimal(int nums[], int len) {
		int p = 0, ans = 0;
		for (int i = 0; i < len; i++) {
			ans += nums[i] * Math.pow(2, p);
			p++;
		}

		return ans;
	}

	public static void main(String[] args) {

		int x = 8;
		NumberComplement obj = new NumberComplement();
		System.out.println("Final outcome :  " + obj.findComplement(x));

	}

}
