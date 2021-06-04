package ch10_1_0604;

public class CalculatorTest {

	public static void main(String[] args) {
		Calc c1 = new CompleteCalc();
		Calculator c2 = new CompleteCalc();
		Calculator c3 = new Calculator();
		
		c1.add(1, 1);
		System.out.println(c1.divide(1, 0));
		
		c2.add(1, 1);
		System.out.println(c2.divide(1, 0));
		
		c3.add(1, 1);
		System.out.println(c3.divide(1, 0));
		
		
		System.out.println(c1 instanceof CompleteCalc);
		System.out.println(c2 instanceof CompleteCalc);
		System.out.println(c2 instanceof Calc);
		System.out.println(c2 instanceof Calculator);
		
		System.out.println(c3 instanceof Calculator);
		System.out.println(c3 instanceof CompleteCalc);
		
	
	}

}
