package com.java.Day0526;

import java.util.Arrays;

public class Prime {

	private int number;
	private int[] numbers;
	private String str;
	
	
	public Prime(int num) {

		for (int i = 0; i <= num; i++) {
			primeNumber(i);
		}
		convert(str);
		System.out.println(Arrays.toString(numbers));
	}

	public void primeNumber(int t) {
		// 0 과 1 은 소수가 아니므로 종료
		if (t < 2) {
			return;
		}

		// 2 는 소수다
		if (t == 2) {
			str = t + " ";
			return;
		}

		for (int i = 2; i < t; i++) {
			// 소수가 아닐경우 종료
			if (t % i == 0) {
				return;
			}
			
		}
		// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
		str += t + " ";
		return;
	}
	
	public void convert(String s) {
		int n = s.split(" ").length;
		String[] st = s.split(" ");
		numbers = new int[n];
		
		for(int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(st[i]);
		}
	}
	

}