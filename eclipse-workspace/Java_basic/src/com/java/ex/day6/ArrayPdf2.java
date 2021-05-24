package com.java.ex.day6;

public class ArrayPdf2 {

	public static void main(String[] args) {
		//배열과 역순 탐색
		//문제
		// 10개의 문자를 입력받아 마지막으로 입력받은 문자부터~~
		
		String[] str = {"A", "E", "C", "X", "Y", "Z", "c", "b", "z", "e"};
		
		String new_str = "";
		
		for (int i = str.length-1; i > -1; i--) {
			new_str += str.length;
		}
		System.out.println(new_str);
	}

}
