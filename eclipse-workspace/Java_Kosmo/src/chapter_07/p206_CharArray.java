package chapter_07;

public class p206_CharArray {

    public static void main(String[] args) {


        char[] alphabets = new char[26];    // 문자 자료형 char 형으로 길이가 26인 배열 선언.
        
        char ch = 'A';      // char형 변수 ch 선언 후, 알파벳 A 대입.
        
        
        
        for (int i = 0; i < alphabets.length; i++, ch++) {      // 반복문으로 alphabets 배열의 길이만큼 반복,
                                                                // i 는 0부터 시작, 1씩 증가. ch 도 아스키 코드값이 1씩 증가.  
            
            /*
             * 각 알파벳 문자는 실제 메모리에 아스키 코드값으로 저장된다.
             * 
             * ch 값에 1을 증가시키면 1증가한 아스키 코드값이 배열에 저장된다.
             * 
             */
            
            
            alphabets[i] = ch;  // ch 값을 배열 alphabets[i] 에 저장.  
            
        }
        
        
        
        for (int i = 0; i < alphabets.length; i++) {                        // 
            
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
            
        }
    }

}
