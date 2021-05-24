package hello;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum = 3.14;
		float fnum = 3.14F;	// F는 식별자
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// minus
		double dnum2 = -3.14;  // 부호비트가 있으므로 마이너스도 잘 표현된다.
		float fnum2 = -3.14F;  
		
		System.out.println(dnum2);
		System.out.println(fnum2);
		
		// float to int
		System.out.println("double2long: " + (long)dnum2);  // 캐스팅 되면서 반올림이 일어나지 않음. 되는것도 있기 때문에 주의 필요.
		System.out.println("double2int: " + (int)dnum2);
		System.out.println("double2shot: " + (short)dnum2);
		System.out.println("double2byte: " + (byte)dnum2);
		
//		int i1 = fnum;
//		long l1 = dnum;
		
		// int to float/double
		int i1 = 32768;
		int i2 = 2147483647;	// max
		int i3 = -2147483648;	// min
		
		double dnum3 = i2;
		System.out.println("----------------------");
		System.out.println("dnum3: " + dnum3);
		System.out.println("dnum3: " + (double)i2);
		
		System.out.println("-2147483648: " + (double)i3); // 결과값 뒤에 E9 표현 -> 0이 9개가 있는것이다.
		
	}

}
