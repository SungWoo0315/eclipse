package chapter_07;

public class p213_ObjectCopy1 {

    public static void main(String[] args) {

        p207_Book[] bookArray1 = new p207_Book[3]; // p207_Book 클래스형으로 bookArray1 객체배열 생성.
        p207_Book[] bookArray2 = new p207_Book[3]; // p207_Book 클래스형으로 bookArray2 객체배열 생성.
        
        
        
        bookArray1[0] = new p207_Book("태백산맥", "조정래");
        bookArray1[1] = new p207_Book("데미안", "헤러만헤세");
        bookArray1[2] = new p207_Book("어떻게 살 것인가", "유시민");
        
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //.arraycopy() 매서드로 배열복사.
        
        /*
         * bookArray1 배열 [0], [1], [2] 에 저장된 값들을,
         * 
         * bookArray2 에 복사한 후 아래의 반복문에서,
         * 
         * 올바르게 복사되었는지 bookArray2 의 값들을 확인하기 위해,
         * 
         * .showBookInfo() 메서드를 이용하여 확인.  
         */
        
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        
        System.out.println("============== 아래는 bookArray1 ===============");
        
        
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
                
        
        
        /*
         * bookArray2 배열의 인스턴스를 만들지 않아도 요소값이 출력된다.
         * 
         * 객체 배열을 사용하려면 인스턴스를 생성해서 넣어야 하는데,
         * 
         * 위의 경우에대한 설명은 다음파일에서,
         * 
         */

    }

}
