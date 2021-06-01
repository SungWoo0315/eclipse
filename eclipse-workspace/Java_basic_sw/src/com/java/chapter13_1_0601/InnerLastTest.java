package com.java.chapter13_1_0601;

// outer class 외부클래스 
public class InnerLastTest {
	
	Object o = new Object()	{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	};
	
	public InnerLastTest() {
		o.toString();
	}
	
	// 익명 클래스 
	Object method2() {
		return new Object()	{
			@Override
			public String toString() {
				return InnerLastTest.class.getName();
			}
		};
	}
	
	
	Runnable method3() {
		return new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
	
	
	
	
	// 메서드 내부 클래스
	void method() {
		
		class ABC {
			int a = 10;
//			static int b = 100; // 메소드 안에는 스태틱이 안됨.
			public ABC() {
				
			}
		}
		ABC abc = new ABC();
		abc.a = 1000;
	}
	
	
	
	
	// 인스턴스 내부 클래스
	public class InstanceInner {
		
		int abc;
		static final int a = 10;
		
		public InstanceInner() {
			
		}
		
		public void print() {
			abc = 1000;
			System.out.println(abc);
		}
	}
	
	// 정적 내부 클래스
	static class StaticInner {
		
		int abc;
		static int abcd = 100;
		
		public StaticInner() {
		}
		
		public void print() {
			System.out.println(abc);
			System.out.println(StaticInner.abcd);
		}
		
		static void info() {
//			System.out.println(abc); // static이 아니라서 오류.
			System.out.println(abcd); // static 필드는 접근 가능.
			
		}
		
		
	
		
		
	}
	
	
}
