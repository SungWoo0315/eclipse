package hello;

public class CharacterEx1 {

	public static void main(String[] args) {
		//문자형! not 문자열!
		char ch1 = 'A'; // 2B == int
		System.out.println(ch1);
		System.out.println((int)ch1); // Casting 
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);

		// 범위  char가 2Byte 2의 15승개 32,768 까지 가능하므로. 유니코드 문자로 32768번의 문자가 출력.
		int ch4 = 32768;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
		int ch5 = 318;
		System.out.println(ch5);
		System.out.println((char)ch5);
	}

}
