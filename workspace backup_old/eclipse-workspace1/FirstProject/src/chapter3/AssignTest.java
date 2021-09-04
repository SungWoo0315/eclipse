package chapter3;

public class AssignTest {

	public static void main(String[] args) {
		int t = 1000;
		int i;
		
		String str = "Test";
		String str2 = new String("Test2");		
		String str3;
		
		System.out.println(t);
		//System.out.println(i); // 대입이 안된것을 쓰면 에러가 난다.
		System.out.println(str);
		System.out.println(str2);
		//System.out.println(str3); // 대입이 안된것을 쓰면 에러가 난다.
		
		i = t;			// 사용하기전에 초기화 또는 대입을 하여서 에러가 안나게 한다.
		str3 = str;		// 사용하기전에 초기화 또는 대입을 하여서 에러가 안나게 한다.
		
		System.out.println(i);		// 대입을 하여 에러가 안남.
		System.out.println(str3);	// 대입을 하여 에러가 안남.
		
		
	}

}
