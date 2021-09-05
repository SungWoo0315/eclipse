package chapter_07;

public class p213_ObjectCopy2 {

    public static void main(String[] args) {

        p207_Book[] bookArray1 = new p207_Book[3];
        p207_Book[] bookArray2 = new p207_Book[3];
        
        
        bookArray1[0] = new p207_Book("태백산맥", "조정래");
        bookArray1[1] = new p207_Book("데미안", "헤러만헤세");
        bookArray1[2] = new p207_Book("어떻게 살 것인가", "유시민");
        
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
        
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        
        
        bookArray1[0].setBookName("나목"); // setBookName() 메서드를 사용하여 책이름 변경.
        bookArray1[0].setAuthor("박완서"); // setAuthor() 메서드를 사용하여 저자 이름 변경.
        
        /*
         * 위에서 배열 bookArray1의 요소값을 각 메서드로 변경을 해주고,
         * 
         * 아래 반복문에서 bookArray1 과 bookArray2 의 배열 요소값을 확인해보면,
         * 
         * bookArray1 의 요소값만 바뀌었는데,
         * 
         * bookArray2 의 요소값도 같이 바뀌어 있는것을 확인 할 수 있다.  
         * 
         * 그 이유는, 
         * 
         * 객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니라, 인스턴스의 주소값이 저장되어 있기 때문,
         * 
         * 객체 배열을 복사할 때, 인스턴스를 따로 생성하는것이 아니라,
         * 
         * 기존 인스턴스 주소값만 복사한다.
         * 
         * 각각의 요소가 같은 인스턴스를 가리키고 있음.
         * 
         * 인스턴스 값이 변경되면 각 배열이 영향을 동시에 받음.
         * 
         */
        
        /*
         * 이와같이 주소값만 복사 하는것을 [얕은복사](shallow copy) 라고 한다.
         */
        
        System.out.println("============== 아래는 bookArray1 ===============");        
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
        
        
        System.out.println("============== 아래는 bookArray2 ===============");        
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        
        
        
                

    }

}
