package chapter_04;

public class IfExample1_94p {

	public static void main(String[] args) {
		
		/*
		 * <조건문>
		 * 조건문의 가장 단순한 형식 if문 
		 * (만약~~이라면.)
		 * 
		 * if(조건식){ 수행문; // 조건식이 참일 경우 이 문장을 수행}
		 * 
		 * 그렇지않으면~
		 * 
		 * else { 수행문; // 조건식이 거짓일 경우에 이 문장을 수행 }
		 */

		int age = 7;	// int형 변수 age선언과 동시에 값 7을 대입.
		if(age >= 8) {	// 만약, age값이 8이상이면. (참이면 = true)
			System.out.println("학교에 다닙니다.");	// 이 문장을 수행. 
		}
		else {	// 그렇지 않으면(거짓이면 = false)
			System.out.println("학교에 다니지 않습니다");	// 이 문장을 수행.
		}

	}

}
