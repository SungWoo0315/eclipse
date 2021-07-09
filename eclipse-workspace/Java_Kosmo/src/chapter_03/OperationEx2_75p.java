package chapter_03;

public class OperationEx2_75p {

	public static void main(String[] args) {
		
		int gameScore = 150;	// int형 변수 gameScore 선언과 동시에 값 150을 대입.
		
		int lastScore1 = ++gameScore;	// int형 변수 lastScore1 선언과 동시에 gameScore에서 1더한 만큼 값을 lastScore1 에 대입.
		System.out.println(lastScore1);	// 결과값 151 출력.
		
		int lastScore2 = --gameScore;	// int형 변수 lastScore2 선언과 동시에 gameScore에서 1만큼 뺀 값을 lastScore2 에 대입.
		System.out.println(lastScore2);	// 결과값은 151에서 1 뺀 값이므로. 150이 나온다.
		
		/*
		 * <증감 연산자의 위치>
		 * 
		 * 문장끝에 ;(세미콜론) 사용.
		 * 
		 * 증감 연산자가 피연산자 앞에 있으면 문장이 끝나기전에 피연산자 값이 증가하거나 감소.
		 */

		int value = 10;	// int형 변수 value 선언과 동시에 값 10을 대입.
		int num = ++value;	// value에서 1더한 만큼 값을 num 에 대입. 
					//++가 왼쪽(피연산자 앞)에 있을땐 문장이 끝나기전에 값이 먼저 증가.
	}

}
