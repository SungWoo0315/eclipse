package chapter_05;

public class p150_StudentTest2 {

    public static void main(String[] args) {
        
        /*
         * <참조변수와 참조값>
         * 
         * [참조변수]는 [힙메모리]에 생성된 [인스턴스]를 가리킨다.
         * 
         * [힙메모리]에 생성된 [인스턴스]의 [메모리주소]는 [참조변수]에 저장된다.
         * =================
         * <저장 형태> 
         * 클래스이름@주소값
         * =================
         * 주소값 = [해시코드값]
         * =====================
         * 객체가 생성되었을 때 생성된 객체에 할당하는 [가상주소값].
         * 
         * [참조변수]를 사용하여 [인스턴스]를 참조할 수 있다.
         * 
         * 이때 주소값을 [참조값]이라고 한다.
         */
        
        p144_Student student1 = new p144_Student();     // 첫번째 학생 생성         // new예약어를 사용하여 생성자[p144_Student();] 호출하여 새로운 클래스 생성.
                                                                                    // p144_Student 클래스 자료형 변수 student1을 선언하고 생성한 클래스 대입.
                                                                                    // =
                                                                                    // 참조변수(student2)에 new p144_Student();로 생성한 클래스 대입.

        student1.studentName = "안연수";                                            // 참조변수 student1를 사용하여 멤버변수 studentName에 값 "안연수"를 대입.

        
        
        p144_Student student2 = new p144_Student();     // 두번째 학생 생성         // new예약어를 사용하여 생성자[p144_Student();] 호출하여 새로운 클래스 생성.
                                                                                    // p144_Student 클래스 자료형 변수 student2을 선언하고 생성한 클래스 대입.
                                                                                    // =
                                                                                    // 참조변수(student2)에 new p144_Student();로 생성한 클래스 대입.

        student2.studentName = "안승연";                                            // 참조변수 student2를 사용하여 멤버변수 studentName에 값 "안승연"를 대입.
        
        // 참조변수값 출력.
        System.out.println(student1);                   // 참조변수 student1 에 저장된 인스턴스 메모리주소. 클래스이름@주소값(해시코드값) 출력.
        System.out.println(student2);                   // 참조변수 student2 에 저장된 인스턴스 메모리주소. 클래스이름@주소값(해시코드값) 출력.
    }

}
