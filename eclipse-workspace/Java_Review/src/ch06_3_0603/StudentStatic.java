package ch06_3_0603;

public class StudentStatic {
	// package modifier
	public static int count = 0;

	
	
	public static int getCount() {
		return StudentStatic.count;
	}
	
	public static void setCount(int i) {
		StudentStatic.count += i;
	}
}
