package chapter_03;

public class OperatonEx1_74p {

	public static void main(String[] args) {
		
		/*
		 * <항과 연산자> 71쪽
		 * 
		 * 연산에 사용하는 기호를 연산자(operator)라고 한다. 
		 * 
		 * 연산자는 항의 개수에 따라 
		 * `단항연산자`, `이항연산자`, `삼항연산자` 로 나뉨
		 * 
		 * 우선순위는 단항연산자가 가장 높고, 단항->이항->삼항 순서이다.
		 */
		
		/*
		 * <대입연산자>
		 * 
		 * 변수에 값을 대입.
		 * 대입연산자는 이항 연산자 중 우선순위가 가장 낮다.
		 * 모든 연산을 다 끝낸 후 마지막에 연산결과를 변수에 대입하는 역할.   
		 * 
		 * int age = 24;	// age 변수에 값 24를 대입함.
		 * 
		 */
		
		
		
		
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;	// mathScore 값과 engScore값을 더하고, totalScore 변수에 대입.
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);

	}

}
