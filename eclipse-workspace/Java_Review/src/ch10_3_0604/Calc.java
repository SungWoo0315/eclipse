package ch10_3_0604;

public interface Calc {
	
	double PI = 3.14;
//	static final int PI = 0;
	int ERROR = -999999;
	
	int add(int n1, int n2);
	int substract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
	
	default void description(){
		System.out.println("계산시...");
		myMethod();
		
	}
	
	
	static int total(int[] arr){
		
		int total = 0;
		
		for(int i: arr){
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
}