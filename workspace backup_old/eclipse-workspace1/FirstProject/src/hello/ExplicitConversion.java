package hello;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;		// 실수가 각각 1 과 0으로 형변환  더하기하면 1이됨.
		int iNum4 = (int)(dNum1 + fNum2);			// 1.2와 0.9를 더한 후(실수연산이 먼저 일어나고) 형변환이 되면 2가 됨.
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		// 책 69p 5번 문제
		char ch3 = '\uAE00';
		
		System.out.println("\uAE00: " + ch3);
		System.out.println("\\uAE00: " + ch3);  //역슬래시가 문제로 인식되어 그대로 출력.
		
	}

}
