package kr.java.chapter11;

public class StringTest {

	public static void main(String[] args) {
		//p.369
		
		String str1 = new String("abc");
		String str2 = "abc"; // str2, str3는 같은 문자열을 가지고 있는데
		String str3 = "abc"; // abc라는 문자열 상수의 메모리 주소를 같이 사용함.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		str2 = "def";
		System.out.println(str2);
		System.out.println(str3);
		
		
		//리터럴과 선언->할당 방법 두가지가 있음
		
		String str4;   // str4 식별자 선언(식별자 변수명) new로 객체를 생성
		str4 = "에이비씨"; // "에이비씨"를 할당 = 객체형식으로 선언
		System.out.print(str4 + " : ");
		
		//final char charat(int)
		//final int PI = 3.14;
		
		//dot operator: .   도트연산자
		System.out.print(str4.charAt(0)); // charAt(index)
		System.out.print(str4.charAt(1));
		System.out.print(str4.charAt(2));
		System.out.print(str4.charAt(3));
		
		System.out.println("");
		
		System.out.println(str4.length());

		int len = str4.length();
		for(int i=0; i < len; i++) { // 범위가 있을때는 for문이 좋다
			System.out.print(str4.charAt(i));
		}
		
		System.out.println("");
		
		/** equals(string) **/
		
		System.out.println(str4.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals("abc"));
		
		if(str3.equals("abc")) {
			//
		}
		
		String str5;
		//if(str5.equals("abc")) { 
			//null point exception 발생
		//}
			
		// 아래 방식을 추천
		if("abc".equals(str3)) {
			// null point exception을 피하기 위해서
		}
		
		
		String[] strs = "에 이 ㅂ ㅣ 씨".split(" "); // split은 ()안에 넣은 기준으로 문자열을 잘라준다.
		System.out.println(strs.length);
		
		System.out.println(strs[0]);
		System.out.println(strs[3]);
		System.out.println(strs[4]);
		
		int lens = strs.length;
		for(int i = 0; i < lens; i++) {
			System.out.print(strs[i]);
		}
		System.out.println("");
		
		
		System.out.println("--------substring--------");
		System.out.println("에 이 ㅂ ㅣ 씨".substring(2, 4));
		

	}

}

