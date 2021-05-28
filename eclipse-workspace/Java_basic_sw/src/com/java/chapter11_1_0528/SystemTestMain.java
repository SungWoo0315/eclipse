package com.java.chapter11_1_0528;

public class SystemTestMain {

	public static void main(String[] args) {
		
//		// ...끝나고자 할때!
//		System.exit(0);
//		System.out.println();
//		// static으로 필드정의가 되어서 new 를 안해줘도 된다.
		
		
		
		long start = System.nanoTime();
		
		// 동작 
		int sum = 0;
		for (int i = 0; i <=1000000000; i++) {
			sum += 1;
		
		}
		// 끝 시점 시간.
		long end = System.nanoTime();
		
		System.out.println("합 : " + sum);
		System.out.println("시간 : " + (end - start));
		
		System.out.println(System.nanoTime());
		System.out.println(System.currentTimeMillis());

	}

}
