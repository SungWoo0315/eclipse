package chapter_04;

public class p119_ContinueExample {

    public static void main(String[] args) {

        /*
         * <continue문>
         * contunue문은 반복문과 함께 쓰인다.
         * 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고,
         * for문의 처음으로 돌아가 증감식을 수행한다.
         * 
         */
        
        int total = 0;
        int num;
        
        for(num = 1; num <= 100; num++) {
            if(num % 2 == 0)
                continue;
            total += num;
      
        }
        System.out.println("1부터 100까지의 홀수의 합은: " + total + " 입니다.");
    }

}
