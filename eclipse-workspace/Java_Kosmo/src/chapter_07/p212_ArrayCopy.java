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


        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1, 2, 3, 4, 5};
        
       
        
        System.arraycopy(array1, 0, array2, 1, 4);
        
        
        
        for (int i = 0; i < array2.length; i++) {
        
            System.out.println(array2[i]);
            
            
        }

    }

}
