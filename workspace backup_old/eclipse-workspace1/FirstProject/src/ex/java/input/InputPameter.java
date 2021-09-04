package ex.java.input;

public class InputPameter {

	public static void main(String[] args) {
		System.out.println("Length: " + args.length);
		//
		System.out.println( args[0] );
		System.out.println( args[1] );
		System.out.println( args[2] );
		
		System.out.println( args[0] instanceof String);
		System.out.println( args[1] instanceof String);
		System.out.println( args[2] instanceof String);
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("sum : " + (a + b + c) );
		
		System.out.println("avg : " + ((a + b + c) / 3));
		
		// run configurations 에서 표준입력의 매개변수 사용.
		System.out.println("-----------");
		
		
	}

}
