package ch04_2_0602;

public class LoopBasic {

	public static void main(String[] args) {
		
		// 107p
		// while(조건식) { 코드블럭 }
		
		// 1~10 자연수를 각가 더해서 합을 출력.
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { // num 증가 + 1
			
//			sum = num + sum;
			sum += num; // 위이식과 같음. 복합연산자로 적음.
			
			// 마지막
			//전위 
//			++num;
//			num = num +1;
//			num += 1;
			
			//후위
			num++;	
		}
		System.out.println("1....10까지 합: " + sum);
		System.out.println("==========");
		
		
		// 1..10 까지 수엣 짝수인 경우만 합.
		num = 1;
		sum = 0;
		while( num <= 10) {
			// 짝수인지 판정?
			if( num % 2 == 0) {
				sum += num;
			}
			
			
			// 마지막
			num++;
		}
		
		// while -> Loop 만들때 거의 사용!
//		while(true) {
//			// 끝낼조건이 필요...
//		}
		
				
		// do while
		
	
		num = 1;
		sum = 0; 
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1....10까지 합: " + sum);
		
		
		// do 한번 실행하고 조건부합이 안되어서 끝나므로 1 출력.
		num = 1;
		sum = 0; 
		
		do {
			sum += num;
			num++;
		} while(num > 2);
	
		System.out.println("1....10까지 합: " + sum);
		
		System.out.println("==========");
		
		
		
		
		
		
		
		
		// for
		
		// for each
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
