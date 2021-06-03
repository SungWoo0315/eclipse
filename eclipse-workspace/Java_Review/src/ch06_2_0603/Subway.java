package ch06_2_0603;

public class Subway {
	int lineNumber; // 번호
	int passengerCout; // 승객 수
	int money; // 버스의 수입
	
	public Subway(int number) {// 버스 번호를 매개변수로 받는 생성자
		this.lineNumber = number;
	}
	
	public void take(int money) { // 승객이 낸 돈을 받음
		this.money += money; // 버스의 수입 증가
		passengerCout++;	// 승객 수 증가
	}
	
	public void showInfo() { // 버스 정보를 출력하는 함수
		System.out.println("지하철" + lineNumber 
				+ "번의 승객은 " + passengerCout 
				+ "명이고, 수입은 " 
				+ money + "입니다.");
	}
	
}