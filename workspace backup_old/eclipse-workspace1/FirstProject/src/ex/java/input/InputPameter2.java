package ex.java.input;

public class InputPameter2 {

	public static void main(String[] args) {
			System.out.println("Length: " + args.length);
			System.out.println("입력값: " + args[0] );
			System.out.println("입력값: " + args[1] );
			
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			
			System.out.println("결과 : " + ( a + 100 ) + ", " + ( b % 10 ) );
			
			
			// run configurations 에서 표준입력의 매개변수 사용.
			System.out.println("-----------");

	}

}
