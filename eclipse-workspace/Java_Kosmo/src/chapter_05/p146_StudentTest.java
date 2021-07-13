package chapter_05;

public class p146_StudentTest {                         // main()함수가 포함된 테스트용 클래스를 따로 만들어 실행.
                                                        // main()함수가 포함된 클래스부터 프로그램이 시작한다.

    public static void main(String[] args) {
        
        p144_Student studentAhn = new p144_Student();       // p144_Student 클래스를 생성하는 코드.
        studentAhn.studentName = "안승연";                  // 
        
        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());

    }

}
