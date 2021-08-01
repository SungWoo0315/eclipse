package chapter_07;

public class p209_BookArray2 {

    public static void main(String[] args) {
        
        p207_Book[] library = new p207_Book[5];         // p207_Book 클래스형으로 library 객체배열 생성.  
        
        library[0] = new p207_Book("태백산맥", "조정래");
        library[1] = new p207_Book("데미안", "헤르만 헤세");
        library[2] = new p207_Book("어떻게 살 것인가", "유시민");
        library[3] = new p207_Book("토지", "박경리");
        library[4] = new p207_Book("어린왕자", "생택쥐페리");

        for (int i = 0; i < library.length; i++) {      // 반복문으로 library 길이만큼 반복.

            library[i].showBookInfo();  
        }
        
            System.out.println("---------------------------");  // 행 구분 처리.  
        
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

    }

}
