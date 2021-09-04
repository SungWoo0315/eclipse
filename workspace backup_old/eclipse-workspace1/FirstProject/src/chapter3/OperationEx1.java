package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {

		// 책 74p
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;	// 총점 구하기
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;		// 평균 구하기
		System.out.println(avgScore);

		System.out.println("--------------------");
		//추가 연습
		double avgScore2 = totalScore % 2.0;	// 나눈것의 나머지 구하는 출력식.
		System.out.println(avgScore2);
		
		int totalScore2 = mathScore * engScore;		// 곱셈
		System.out.println(totalScore2);
		
		int totalScore3 = mathScore - engScore;		// 뺄셈
		System.out.println(totalScore3);
		
		System.out.println("-----------------------");
		
		// 추가 연습
		
		// byte : +,-,/
		byte b1 = 50;
		byte b2 = 30;
		
		System.out.println(b1 + b2);

		
		// boolean : +, -, *, /
		
		// float / int
		
		
		
	}

}
