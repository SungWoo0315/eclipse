package com.java.chapter11_2_0528;

import java.util.StringTokenizer;

public class StringSplitTest {

	public static void main(String[] args) {
		
		String str = "Java Programming is funny things!";
		// 패턴에러 String str = "Java\\Programming\\is\\funny\\things!";
		
		// split()
		String[] result = str.split(" "); // 문자열을 띄워쓰기 단위로 쪼개서..
		
		for (String s : result) {
			System.out.println(s);
			
		}
		
		System.out.println("========");
		
		str = "Java Programming is funny things!";
		
		// StringTokenzer class
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}

	}

}
