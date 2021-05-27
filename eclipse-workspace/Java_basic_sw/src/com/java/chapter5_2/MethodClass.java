package com.java.chapter5_2;

public class MethodClass {
	public int add(int i1, int i2) {
		int result;
		result = i1 + i2;
		
		return result;
		
//		return i1 + i2; 위의 세줄과 같은것임.
	}
	
	public void printTenTotal() {
		int total = getTenTotal();
		System.out.println(total);
	}
	public int getTenTotal() {
		//...
		return 10*10; // 1. 값을 반환.
	}
	public void printGreeting(String name) {
		System.out.println(name + " Hello...");
		return; // 1. void 반환.
	}
	public void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0일수 없음...");
			return; // 2. cod break 의미. 
		} else {
			//....
		}
		// 리턴은 다양하게 쓰임.
/*		public void test(int num3, num4) {
			for (int i = 0; i < 100; i++) {
				if(i==0);
				return;	
			} */
		}
	}

	

