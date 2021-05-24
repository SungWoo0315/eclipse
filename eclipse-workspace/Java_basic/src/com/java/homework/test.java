package com.java.homework;

public class test {

	public static void main(String[] args) {
		
		// 조건 비교
		
		int i = 0;
		boolean b = false;
		
		if(i == 1) {
			//System.out.println("true");
			b = true;
		}
			else {
			//System.out.println("false");
				b = false;
		}
		
		//3항 연산자 : " 조건식 ? 참값 반환 : 거짓 반환"    // 위의 if 문과 같은 식.
		b = i == 1 ? true : false;
	}
}

