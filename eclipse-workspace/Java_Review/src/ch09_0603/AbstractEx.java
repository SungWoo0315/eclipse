package ch09_0603;

public class AbstractEx {

	// 추상클래스
	// abstract class 선언.
	// - abstract method 선언. -> 코드블럭 X
	
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.turnOn();
		
		Computer c = new Desktop();
		c.turnOff();
		
		// 추상클래스는 new 연산자 안된다!!!
//		Computer c = new Computer();
		
		//이너 클래스
		Computer cc = new Computer() {

			@Override
			public void display() {
				
			}

			@Override
			public void typing() {
				
			}
				
		};
		
		//이너 클래스
		Object sss = new Object() {
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "...........";
			}
			
		};
		
		System.out.println(sss.toString());
		
	}

}
