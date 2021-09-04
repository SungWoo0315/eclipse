package ex.java.input;

public class Quiz3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		int d = a % b;	
		
		System.out.println(a + " / " + b + " = " + c + "..." + d);

	}

}
