package kr.java.chapter03;

public class AssignTest {

	public static void main(String[] args) {
		int t = 1000;
		int i;
		
		String str = "Test";
		String str2 = new String("Test2");
		String str3;
		
		System.out.println(t);
		// System.out.println(i);
		System.out.println(str);
		System.out.println(str2);
		// System.out.println(str3);
		
		i = t;
		str3 = str;
		
		System.out.println(i);
		System.out.println(str3);
		
		int num = 10;
		
		System.out.println(+num); // 값 10 그대로
		System.out.println(-num); // 값 10에 -가 붙지만 num값이 실제로 바뀌지는 않음
		System.out.println(num); // 값 10 그대로 
		
		num = -num; // num값을 음수로 바꿔서 다시 num에 대입함
		System.out.println(num); // 값 -10이 출력
		
		// byte
		byte b = 1;
		System.out.println(b);
		System.out.println(-b);
		
		// double
		double d = 3.2;
		System.out.println(d);
		System.out.println(-d);
		
		
	}

}
