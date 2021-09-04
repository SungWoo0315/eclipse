package kr.java.chapter07;

import java.util.Arrays;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		// 10개의 문자를 입력받아 마지막으로 입력 받은 문자부터 첫 번째 입력받은 문자까지
		// 차례로 출력하는 프로그램을 작성하시오.
		// 입력 예 A E C X Y Z c b z e (역순으로 출력)
		
		char[] data = {'A', 'E', 'C', 'X', 'Y', 'Z', 'c', 'b', 'z', 'e'};
		//data = 
		
			for(int i = data.length - 1; i >= 0; i--) {
			System.out.print(data[i]);
		}
		

	}

}
