package com.java.chapter11_2_0528;

public class StringIndexing {

	public static void main(String[] args) {
		String str = "Java Programming";
		
		System.out.println(str.indexOf("J")); //0번째 위치한 J, 0이 출력됨.
		System.out.println(str.indexOf("j")); //
		System.out.println(str.indexOf("P")); //5번째 위치한 P, 5가 출력됨.
		System.out.println(str.indexOf("gram")); //8번째에서부터 시작하기때문에 8이 출력.
		
		
		// 자르기
		System.out.println(str.substring(0, str.indexOf("gram")));
		
		
		// 뒤에서부터 찾는순서.
		System.out.println(str.lastIndexOf("n"));
		System.out.println(str.lastIndexOf("gram"));
		
		
		// 주어진 문자로 시작하느냐를 판단. 참.거짓.
		System.out.println(str.startsWith("java")); //일치하지 않음으로 거짓.
		System.out.println(str.startsWith("Java")); //일치하는것으로 시작하므로 참.
		
		
		// trim : 공백제거 
		// Scanner -> 
		String str1 = "                   하하하";
		String str2 = "호호호                   ";
		String str3 = "       호호호            ";
		
		System.out.println(str1);
		System.out.println(str1.trim());  // 공백이 제거됨.
		System.out.println("===========");
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println("===========");
		System.out.println(str3);
		System.out.println(str3.trim()); 
		
		
		
	}

}
