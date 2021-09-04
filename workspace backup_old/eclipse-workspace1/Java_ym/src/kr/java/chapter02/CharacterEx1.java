package kr.java.chapter02;

public class CharacterEx1 {

	public static void main(String[] args) {
		// char형은 문자형! not 문자열!
		char ch1 = 'A'; // 2B == int
		System.out.println(ch1);
		System.out.println((int)ch1); // Casting
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3); // int 정수 67을 char형으로 casting 발생
		
		//범위
		int ch4 = 32768;
		System.out.println(ch4);
		System.out.println((char)ch4); // 컴퓨터 안에서는 유니코드를 다루기 때문에, 2Byte인 Char형을 사용
		
		int ch5 = 318;
		System.out.println(ch5);
		System.out.println((char)ch5); 

	}

}
