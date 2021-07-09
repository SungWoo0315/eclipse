package chapter_04;

public class SwitchCase_102p {

	public static void main(String[] args) {
		
		/*
		 * <조건문과 조건연산자> 100쪽
		 * 
		 * if - else 문은 조건 연산자로도 구현 가능.
		 * 
		 */
		
		
		int a = 2;	// int형 변수 a 선언과 동시에 값 2 대입.
		int b = 3;	// int형 변수 b 선언과 동시에 값 3 대입.
		int max;	// int형 변수 max 선언.
		
		
		// if - else 문.
		if(a > b)	// 만약 a가 b보다 크면 (true)
			max = a;	// 선언된 변수 max에 a값을 대입.
		else	// 그렇지 않을경우	(false)
			max = b;	// 선언된 변수 max에 b값을 대입.
		
		
		// 조건연산자.
		max = (a > b) ? a : b;	// a값이 b보다 크다가 참일 경우. a값을 max 변수에 대입. 거짓일경우 b값을 max변수에 대입.
		
		System.out.println(max);	// 변수 max값을 출력.
		System.out.println("===");	// 구분선.
		
		/*
		 * <switch-case문>
		 * 
		 * 조건이 많아지고 중괄호{ }가 많아지면 if-else 문으로 작성하기엔 가독성이 많이 떨어진다.
		 * 
		 * 조건식의 결과가 정수 또는 문자열 값이고,
		 * 그 값에 따라 수행되는 경우가 각각 다른 경우,
		 * switch-case문으로 구성하는것이 가독성이 좋다.
		 * switch-case문은 여러문장이 있어도 {}를 여러번 사용하지 않는다.
		 */
		
		// if-else문 으로 작성했을 때.
		int ranking = 1;
		char medalColor;
		
		if(ranking == 1 ) {
			medalColor = 'G';
		}
		else if(ranking == 2) {
			medalColor = 'S';
		}
		else if(ranking == 3) {
			medalColor = 'B';
		}
		else {
			medalColor = 'A';
		}
		
		// switch-case문 으로 작성했을 때.
		switch(ranking) {
		case 1 : medalColor = 'G';
				 break;
		case 2 : medalColor = 'S';
				 break;
		case 3 : medalColor = 'B';
				 break;
		default :
				 medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");

	}

}
