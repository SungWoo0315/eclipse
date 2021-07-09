package chapter_04;

public class IfExample2_97p {

	public static void main(String[] args) {
		
		int age = 9;	// int형 변수 age선언과 동시에 값 9 대입(초기화).
		int charge;	// int형 변수 charge 선언.(초기화 되지 않음)	
		
		if(age < 8) {	// 만약 age가 8미만이면~
			charge = 1000;	// charge 변수에 값 1000을 대입하고
			System.out.println("취학 전 아동입니다.");	// 이 문장을 실행.
		}
		else if(age < 14) {	// 만약 age가 14미만이면
			charge = 2000;	// charge 변수에 값 2000을 대입하고 
			System.out.println("초등학생입니다.");	// 이 문장을 실행.
		}
		else if(age < 20) {	// 만약 age가 20미만이면 
			charge = 2500;	// charge 변수에 값 2500을 대입하고
			System.out.println("중,고등학생입니다.");	// 이 문장을 실행.
		}
		else {	// 위 조건을 모두 만족하지 않을 시.
			charge = 3000;	// charge 변수에 값 3000을 대입하고
			System.out.println("일반인입니다.");	// 이 문장을 실행.
		}
		System.out.println("입장료는 " + charge + " 원입니다.");	// 조건문이 끝나고나서 이 문장을 실행.
		// 조건문에서 변수 charge에 대입된 값이 같이 출력된다.  

	}

}
