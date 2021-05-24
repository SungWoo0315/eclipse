package com.java.chapter4;

public class ifStatementExam {

	public static void main(String[] args) {
		
		int age = 10;
		
		// 조건1
		if (age >= 8) { // 조건식1
			System.out.println("8살 이상입니다. 학교에 다닙니다.");
		}
		else { // 조건이 false 인 경우.
			System.out.println("8살 미만입니다. 학교에 다니지 않습니다.");
		}
		
		
		// 복합 조건;
		int age2 = 10;
		// age1 8살 이상[이고]("이고" 붙으면 엔드로 묶어줘야한다.) age2 10보다 큰것. 
		
		//연산자로 묶어주는게 안전하다.
		if ((age >= 8) && (age2 >= 10) ) { // 조건식1
			System.out.println("8살 이상입니다. 학교에 다닙니다.");
		}
		else { // 조건이 false 인 경우.
			System.out.println("8살 미만입니다. 학교에 다니지 않습니다.");
		}
		
	}

}
