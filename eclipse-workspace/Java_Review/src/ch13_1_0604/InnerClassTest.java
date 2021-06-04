package ch13_1_0604;

import ch10_4_0604.Buy;

// Outer class
public class InnerClassTest {
	
	
	
	// 인스턴스 내부 클래스
	class InnerClass {
		String name;
		final static int a = 0;
		
		void info() {
			
		}
	}
	
	private int num = 10;
	private static int snum = 10;
	
	
	
	// 정적 내부 클래스
	static class StaticInnerClass {
		int num = 0;
		static int i =0;
		
		void info() {
			//num += 1;
			snum += 10;
		}
	}
	
	
	// 지역 내부 클래스 -> method
	
	public void local() {
//		Test t0 = new Test();
		
		class Test{
			int a;
			String n;
		}
		// --> 여기서부터 써야 한다.
		Test t = new Test();
	}
	
	public Runnable getRunnable() {
		
		class MyRunnable implements Runnable {
			@Override
			public void run() {
			
				
			}
		}
		return new MyRunnable();
	}
		
	public int getint() {
	
		String a = "";
		String b ="CC";
		b = a;
		
		return 0; // 지역변수. 메소드값이 리턴을 통해서 밖으로 확장.
	}
	
	

	// 익명 내부 클래스

	Object o = new Object() {
		@Override
		public String toString() {
			return "--------";
		}
	};
	
	public Object getobj() {
		return new Object() {
			@Override
			public String toString() {
				return "-------";
			}
		};
	}
	
	Buy b = new Buy() {
		public void buy() {
			
		}
	};
	
	
	
	
	
	
	
	
	
	
}
