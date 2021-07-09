package chapter_03;

public class OperationEx3_78p {

	public static void main(String[] args) {

		/*
		 * <관계 연산자> 76쪽
		 * 
		 * >, <, >=, <=, ==, !=
		 * 
		 * 관계연산자는 항이 두개인 이항 연산자이다.
		 * 두개의 항을 비교, 그 여부를 검사.
		 * 결과 값은 참(true), 거짓(false)로 반환된다.
		 */
		
		/*
		 * <논리연산자> 77쪽
		 * 
		 * &&(논리곱), ||(논리합), !(부정)
		 * 
		 * 두명제가 참이면 논리곱은 참이고,
		 * 두명제 중 하나만 참이면 논리 합은 참이다.
		 * 
		 * 참의 부정은 거짓.
		 * 거짓의 부정은 참.
		 * 
		 * 주로 관계연산자와 함께 사용.
		 * 
		 * 관계연산자의 우선순위가 논리연산자보다 높다.
		 * 
		 * 관계연산자의 값을 기반으로 논리 연산자의 결과값을 계산.
		 */
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
