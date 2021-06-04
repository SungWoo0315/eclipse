package ch10_1_0604;

public class CompleteCalc extends Calculator {

	@Override
	public int divide(int n1, int n2) {
		if(n2 != 0)
			return n1/n2;
		else
			return Calc.ERROR;
	}
	
}
