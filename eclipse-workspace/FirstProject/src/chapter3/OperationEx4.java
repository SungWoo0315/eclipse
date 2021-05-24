package chapter3;

public class OperationEx4 {

	// 책 81p
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		System.out.println("---------------------");
		// 책 82p
		int num = 10;
		boolean isEven;
		isEven = (num % 2) == 0 ? true : false;
		System.out.println(isEven);
	}

}
