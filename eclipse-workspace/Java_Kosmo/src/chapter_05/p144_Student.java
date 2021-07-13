package chapter_05;

public class p144_Student {
    
    // 멤버변수 : 클래스 속성을 나타냄
    
    int studentID;              // int형 변수 studentID(학번)를 선언           // 멤버변수
    String studentName;         // String형 변수 studentName(학생이름) 선언    // 멤버변수
    int grade;                  // int형 변수 grade(학년) 선언                 // 멤버변수
    String address;             // String형 변수 address(사는곳) 선언          // 멤버변수
    
    
    
    // 메서드 : 멤버변수를 이용하여 클래스 기능을 구현
    
    public String getStudentName() {    // 학생이름을 반환하는 메서드.
                                        // studentName 자료형이 String이므로 반환형도 String

        return studentName;             // 자료형이 String인 studentName값 반환.
    }
    
    
    /*
     * <프로그램을 시작하는 main()함수>
     * 
     * 클래스를 사용하여 프로그램을 실행하기 위해 main() 함수 사용.
     * main() 함수는 자바 가상머신 JVM이 프로그램을 시작하기 위해 호출하는 함수.
     * 클래스 내부에 만들지만 클래스의 메서드는 아니다.
     * 
     * main()함수에서 클래스를 사용하는 두가지 방법.
     * 1. 클래스 내부에 main()함수 만들기
     * 2. 외부에 테스트용 클래스 만들어 사용.
     * 
     */
    
    public static void main(String[ ] args) {               // 클래스 내부에 main()함수 만듦.
                                                            // 이 클래스가 프로그램의 시작 클래스가 된다.

        
        p144_Student studentAhn = new p144_Student();       // 새로운 클래스(p144_Student studentAhn)를 생성.
        studentAhn.studentName = "안연수";                  // studentAhn 클래스의 멤버변수(studentName)에 "안연수" 값을 대입.
        
        System.out.println(studentAhn.studentName);         // studentAhn 클래스의 멤버변수(studentName) 출력.
        System.out.println(studentAhn.getStudentName());    // studentAhn 클래스의 메서드 getStudentName() 를 사용하여 멤버변수 studentName 출력.
    }
    
    
}
