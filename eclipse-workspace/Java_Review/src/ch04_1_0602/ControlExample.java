package ch04_1_0602;

public class ControlExample {

	public static void main(String[] args) {

		int age = 10;
		
		System.out.println((age >= 6)); // true, false
		System.out.println((age <= 6)); // true, false
		System.out.println((age & 6));	// 값.
		
		if( age >= 6) {
			System.out.println("나이가 " + age);
		}
		
		if(age < 6) {
			System.out.println("나이가 " + age);
		} else {
			System.out.println("다시...");
		}
		
		
		
		
		// 95p
		char gender = 'F';
		System.out.println(gender);
		
		// F인지?
		if( gender == 'F' ) {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}

		// F의 int 값이 70 이니까.
		if( gender == 70 ) {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}
		
		// != 사용한 방법. 결과는 똑같음.
		if( gender != 70 ) {
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}
		
		// 코드블럭이 없어도 가능.
		if( gender != 70 ) 
			System.out.println("남성");
		 else 
			System.out.println("여성");
		
		
		// 코드블럭이 없을땐 한줄씩 밖에 안되지만 코드블럭이 있으면 두줄 이상 가능.
		if( gender != 70 ) {
			System.out.println("남성");
			System.out.println("남성");

		} else {
			System.out.println("여성");
		}
		
				
		// 조건식 : 이항 관계연산자 : <,>,<=,>=,!=
		
		// 산술식과 함께는?
		// 단순 산술이나 연산은 안되고. 산술과 조건이 있어야 됨.
//		if( (1 + 1){
//			
//		}
		
		if( (1 + 1) > 0 ) {
			
		}
		
		
		System.out.println("========삼항연산자 적용.==========");
		// 삼항연산자 적용.
		// 조건식 ? 참 : 거짓값. 반환!
		System.out.println( (gender != 70 ? "남성" : "여성") );
		
		
		
		System.out.println("======복합 if-else if-else=====");
		// 복합 if-else if-else
		age = 8;
		int charge = 0;
		// 코드블럭을 안써도 되지만 초반엔 헷갈릴수 있으니 습관처럼 일단 쓰기.{}
		if( age < 8) {
			charge = 1000;
		} else if( age < 14) {
			charge = 2000;
		} else if( age < 20) {
			charge = 2500;
		} else {
			charge = 3000;
		}
		
		//삼항연산자 적용.
		System.out.println( (age < 8 ? 1000 : (age < 14 ? 2000 : 2500)));
		
		
		// 100p
		int score = 60;
		char grade = 'Z';
		
		if( score > 90 ) {
			grade = 'A';
		} else if( score > 80) {
			grade = 'B';
		} else if( score > 70) {
			grade = 'C';
		} else if( score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		
		// 60보다 크고, 69 작은. // 둘다 만족해야 함으로 and조건.
		score = 80;
		
		if( (score >= 60) && (score <= 69) ) {
			grade = 'D';
		} else if( (score >= 70) && (score <= 79)) { //79~70
			grade = 'C';
		} else if( (score >= 80) && (score <= 89)) { //89~80
			grade = 'B';
		} else if( (score >= 90) && (score <= 100)) {
			grade = 'A';
		} else {
			grade = 'F';
		}
		
		System.out.println("score : " + score + "->" + grade);
		
		
		// Nested if 
		// 95: A+, 90>: A
		String grd = "";
		if(score >= 90) {
			if(score >= 95) {
				grd = "A+";
			} else {
				grd = "A";
			}
		} else {
			if(score >= 85) {
				grd = "B+";
			} else {
				grd = "B";
			}
		}
		
		
		
		System.out.println("======switch-case=======");
		// switch-case
		// switch는 범위판단이 어렵다. 단일한 판단은 깔끔하게 가능.
		// 코드블럭은 있어도 없어도 됨.
		
		int rank = 40;	//입력된 값.
		
		switch (rank) { // key: 숫자형(정수, char), 1.8이상 문자
		
		case 10: 
			System.out.println("10");
			break;
				
		case 20:	// break; 가 없으면 or 같은 효과. 20또는 30 같은 의미. case30으로 넘어감.
		case 30:
			System.out.println("20 30");
			break;
		case 40:
		case 50:
			System.out.println("50 50");
			break;
		
		// case 조건에 어느것도 부합되지 않으면 default로 넘어가서 출력.
		default:
			System.out.println("~~~~~~~ end ~~~~~~~");
				break;
		}
		
		// switch char 
		grade = 'D';
		
		switch (grade) {
		case 'A': 
		case 'a':
			System.out.println("AAAAA");
			break;
		case 'B':
		case 'b':
			System.out.println("BBBBBB");
			break;
		default:
			System.out.println("FFFFFF");
		}
		
		
		// jdk1.8 이상.
		
		String position = "이사";
		switch (position) {
		case "과장":
			break;
		case "차장":
			break;
		case "이사":
			break;
		default:
			
		}
		
		
		System.out.println("----------연습----------");
		// 현재 월을 알고. 월의 계절 값을 출력하도록.
		//1,2,12: 겨울 
		//3,4,5: 봄
		//6,7,8: 여름
		//9,10,11: 가을
		
		System.out.println("--------switch로 사용-------");
		int month = 2;
		String season = ""; // 봄, 여름, 가을, 겨울.
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			System.out.println(month + "월은 " + season + " 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			System.out.println(month + "월은 " + season + " 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			System.out.println(month + "월은 " + season + " 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			System.out.println(month + "월은 " + season + " 입니다.");
			break;
		default:
			System.out.println("월을 다시 입력하세요.");
			break;
		}
		
		
		
		
		System.out.println("--------if-else로 사용-------");
		
		int month1 = 12;
		String season1 = ""; // 봄, 여름, 가을, 겨울.
		
		if (month1 < 3 || month1 == 12) {
			season1 = "겨울";
		
		} else if (month1 < 6 && month1 > 2) {
			season1 = "봄";
			
		} else if (month1 < 9 && month1 > 5) {
			season1 = "여름";
		} else {
			season1 = "가을";
		}
		
		System.out.println(month1 + "월은 " + season1 + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
