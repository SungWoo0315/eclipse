package chapter_07;

public class p212_ArrayCopy {
  
    public static void main(String[] args) {
        
        /*
         * <배열 복사>
         * 
         * 기존 배열에 저장된 자료를 가져오려 할때 배열 복사를 활용.  
         * 
         * >>> 배열 복사 방법.
         * 
         * 1. 기존배열과 배열 길이가 같거나 더 긴 배열생성,
         *    for문 사용하여 각 요소값을 반복해서 복사.
         *    
         * 2. System.arraycopy(
         *      복사할 배열이름
         *      ,복사할배열의 첫번째위치
         *      ,복사해서 붙여넣을 대상 배열 이름
         *      ,복사해서 대상배열에 붙여넣기를 시작할 첫번째위치
         *      ,자료를복사할요소개수
         *      ) 
         *      
         *      메서드 사용하여 복사.   
         *    
         */


        int[] array1 = {10, 20, 30, 40, 50};        // int 형 요소 로 선언한 변수 array1 에,                                                                                                     // int 형 요소 10개인 배열 생성.  
                                                    // new int[] 배열생성 생략.// 배열개수 생략,  // but, 배열 자료형 따로 먼저 선언하면 생략 불가.  
                                            
                                                    // 정수 5개를 저장할 배열 선언하고, 각 요소를 10, 20, 30, 40, 50 값으로 초기화.
                                                    
        
        
        int[] array2 = {1, 2, 3, 4, 5};             // int 형 요소 로 선언한 변수 array2 에,      
                                                    // 정수 5개를 저장할 배열 선언하고, 각 요소를 1, 2, 3, 4, 5 값으로 초기화.
       
        
        System.arraycopy(array1, 0, array2, 1, 4);  // 
        
        
        
        for (int i = 0; i < array2.length; i++) {
        
            System.out.println(array2[i]);
            
            
        }

    }

}
