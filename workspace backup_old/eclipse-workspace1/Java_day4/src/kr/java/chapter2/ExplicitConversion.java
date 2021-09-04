package kr.java.chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 정수형 변환 뒤에 연산이 됨 1 + 0 = 1
		int iNum4 = (int)(dNum1 + fNum2); // 암묵적 형 변환 뒤에 연산이 됨 1.2 + 0.9 = 2.1 => 2(정수형이기 때문에 소수점 아래 숫자 없어짐)
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
