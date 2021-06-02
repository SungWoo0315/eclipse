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
		// for( 초기화식; 조건식; 증감식) {코드블럭}
		// 각각의 index++
		
		// for( ; 조건식; 증감식) {코드블럭}
		// for( ; ; 증감식) {코드블럭}
		// for( 초기화; 조건식; {코드블럭}
		// for( ; ;) {코드블럭} 
		// ----> while()
		
		
//		int num2;
		for( int num2 = 1; num2 <= 5; num2++) {
			
		}
		// 문자형 a ~ z까지 출력하시오.
		char ch;
		for (int c = 63; c < 90; c++) {
			System.out.print((char)c);
		}
		
		
		
		
		
		
		
		// 1..10 까지 수엣 짝수인 경우만 합.
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if( i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("\n"+"===========");
		System.out.println(sum);
		
		for(byte b = 0; b < 127; b++) {
			
		}
		for(float f = 0; f < 100.0; f++) {
			
		}
		
		
		// 중첩된 반복문!
		while(num < 10) {
			while( num % 2 == 0) {
				//
			}
			num++;
		}
		
		for(int d = 2; d <= 9; d++) {
			for(int i = 1; 1 <= 9; i++) {
				System.out.println( d + "x" + i + " = " + (d * i));
				System.out.printf( "%d x %d = %d", d, i, d * i);  	// 포멧팅을 쓰면 깔끔해진다.
			}
		}
		
		
		
		System.out.println("===== continue문 =====");
		// continue
		// 반복 중 코드블럭 안에서 어떤 조건인 경우 처음 반복으로 돌아가는것.
		// 1...100 사이 홀수만 합!
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			// 짝수인 경우 -> 다시 반복으로 돌아감.
			if ( i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		
		
		System.out.println("===== break문 =====");
		// break;
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			// 짝수인 경우 -> 다시 반복으로 돌아감.
			if ( i % 2 == 0) {
				break;
			}
			sum += i;
		}
		
		// 121p 참고.
		for(int d = 2; d <= 100; d++) {
			for(int i = 0; i <= 100; i++) {
				if ( d == 55) {
					
				System.out.println( d + "x" + i + " = " + (d * i));
				System.out.printf( "%d x %d = %d", d, i, d * i);  	// 포멧팅을 쓰면 깔끔해진다.
				
				break;
			}
		}
		}
		
		
		
		// for each 향상된 for문
		// - 컬렉션 객체 자체를 다룰때 유리.
		// for( element(요소): 컬렉션) {코드블럭}
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

 	
}

