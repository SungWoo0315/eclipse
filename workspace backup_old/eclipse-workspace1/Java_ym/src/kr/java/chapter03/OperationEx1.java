package kr.java.chapter03;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore); // 합계 구하기
		
		double avgScore = totalScore / 2.0; // 평균 구하기
		System.out.println(avgScore);
		
		
		// 아래 연습해보기
		// byte : +, -, /
		// boolean : +, -, *, /	
/*		
 		boolean b = true;
		boolean b1 = true;
		System.out.println(b + b1);
		System.out.println(b - b1);
		System.out.println(b / b1); 
										*/
		
		// float / int
		float f = 10.1F;
		float f1 = 1.1F;
		System.out.println(f + f1);
		System.out.println(f - f1);
		System.out.println(f * f1);
		System.out.println(f / f1);
		
		int i = 10;
		int i1 = 3;
		System.out.println(i + i1);
		System.out.println(i - i1);
		System.out.println(i * i1);
		System.out.println(i / i1);
		System.out.println(i % i1);

		

	}

}
