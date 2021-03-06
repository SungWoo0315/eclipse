package chapter_04;

public class p116_NestedLoop {

    public static void main(String[] args) {

        /*
         * <중첩된 반복문>
         * 
         * 반복문 안에 또다른 반복문을 중첩해서 사용하는 경우가 있다.
         * 
         * 어떤 반복문을 먼저 수행해야 하는지 확인해야한다. 
         * 초기화값을 잘 초기화 했는지도 확인필요.
         * 
         * for문 외에 다른 반복문에서도 중첩가능.
         */

        int dan;            // int형 변수 dan을 선언만 함.
        int times;          // int형 변수 times를 선언만 함.

        for (dan = 2; dan <= 9; dan++) {        // 변수 dan에 값 2를 대입하고 초기화.
                                                // 변수 dan은 값이 2이므로, 조건식 dan <= 9 에 참.
                                                // 조건식이 참이므로, 수행문으로 넘어간다.

            for (times = 1; times <= 9; times++) {         // 변수 times에 값 1을 대입하고 초기화.
                                                           // 변수 times는 값이 1이므로, 조건식 times <= 9 참.
                                                           // 조건식이 참이므로, 수행문으로 넘어간다.

                System.out.println(dan + "X" + times + "=" + dan * times);      // 수행문에서 변수 dan의 값이 2이고, 변수 times의 값이 1이다.
                                                                                // 출력 결과는 2 X 1 = 2 * 1
                                                                                // 2 X 1 = 2 가 출력된다.

                                                                                // 수행문을 수행하고난 뒤 증감식 times++을 수행하여 값이 2가 된다.
                                                                                // 다시 for 반복문에서 조건식 times <= 9 를 검사했을때 times 값은 2이므로 참.
                                                                                // 다시 수행문으로 내려가 수행하면
                                                                                // 2 x 2 = 4 가 출력된다.
                                                                
                                                                                // ~
                                                                
                                                                                // 수행문을 수행하고 증감식 times++을 수행하여 값이 9가 된다.
                                                                                // 다시 for 반복문에서 조건식 times <= 9 를 검사 했을때 times 값은 9이므로 참.
                                                                                // 수행문으로 내려가 수행하면
                                                                                // 2 X 9 = 18 이 출력된다.
                                                                
                                                                                // 수행문을 수행하고 증감식 times++을 수행하여 값이 10이 된다.
                                                                                // 다시 for 반복문에서 조건식 times <= 9 를 검사 했을 때 times 값은 10이므로 거짓.
                                                                                // for반복문 조건식에서 거짓이므로 반복문을 종료하고 다음 수행문을 수행한다.
            }
            System.out.println();                                               // 종료된 반복문 다음에 수행하는 출력식.
                                                                                // 결과적으로 2단 곱셈을 하고 난 뒤 빈줄 한줄을 출력한다.

                                                                                // 출력식 수행문을 수행하고 난 뒤 증감식 dan++을 수행하여 값이 3이 된다.
                                                                                // 다시 for 반복문에서 조건식 dan <= 9 를 검사했을 때 dan 값은 3이므로 참.
                                                                                // 다시 수행문으로 내려가 수행하면
                                                                                // for 반복문을 수행하게 되고 3단 구구단 곱셈결과값이 출력된다.
                                                                                // 종료된 반복문 다음에 빈줄 출력하는 수행문을 실행하고
                                                                                // 다시 dan++ 증감식을 수행하여 for반복문을 수행.
                                                                    
                                                                                // dan++ 가 조건식 dan <= 9 를 검사했을 때 거짓이 되었을 때.
                                                                                // 전체 for반복문이 종료된다.
                                                                    
                                                                                // 최종 결과로 구구단이 2단부터 9단까지 한줄공백으로 구분뒤어져서 출력된다.
        }

    }

}
