package review_0602;

//외부클래스
public class InnerClassTest {
	
	// 멤버
	InnerClass inner;
	
	
	// 1. 인스턴스 이너클래스
	class InnerClass {
		private int a;	//속성 가질수 있음.
		
		// static 제한.
//		static String name; // static 제한으로 오류 뜸.
		
		final static String name = ""; // final 사용하면 예외적으로 사용 가능.
		
		
		//메소드도 가질수 있다.
		public void info() {
			
		}
	}
	
	// 2. static InnerClass
		static class StaticInnerclass {
			
			static String name;
			
			// 메소드 가능
			public void info() {
				
			}
			
			//static 메소드도 가능.
			public static void info2() {
				
			}
			
		}
	
	// 3. Local innerclass
		public void test() {
			
			int a; //지역변수
			
//			LocalInnerClass local1;
//			local1 = new LocalInnerClass();	// 로컬은 위치를 주의해서 사용해야함.
			
			class LocalInnerClass {
				private String name;
				
				public LocalInnerClass() {
					
				}
				
				public String info() {
					return this.name;	// 로컬 클래스
				}
			}
			
			LocalInnerClass local;
			local = new LocalInnerClass();
		}
		
		
	// 4. Anonymouse InnerClass // 두가지 방식이 있다.
	public Object getObject() {
		return new Object() {
			@Override
			public String toString() {
				return "별점 : " + 1000;
			}
		};
	}
	public Object getObject2() {
		
		Object obj = new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
		};
		
		return obj;
	}
	
	
	public static void main(String[] args) {
		// 1. 인스턴스 이너클래스 객체.
		InnerClassTest out = new InnerClassTest();
		InnerClass io = out.new InnerClass();
		
		// 2. static class 사용
		System.out.println(StaticInnerclass.name);
		StaticInnerclass.info2();
	
	}

}



