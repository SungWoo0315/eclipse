package chapter_05;

public class p165_StudentTest {

    public static void main(String[] args) {
       
      p164_Student studentLee = new p164_Student();

      
      //studentLee.studentName = "이상원";                 // p162_Student 에서 studentName 변수에 [접근제어자] private 예약어를 주어 
                                                           // 외부 클래스에서 사용 할 수 없어서 오류 발생. // 주석처리.
      
      
      studentLee.setStudentName("이상원");                 // setStudentName() 메서드를 통해 private 변수에 접근 가능.
                                                           // public 메서드 setStudentName() 를 통해서 private 변수에 접근하여,
                                                           // "이상원" 값을 지정해 줄 수 있다.
      
                                                          /*
                                                           * 외부 클래스에서 private 변수에 직접 접근은 불가능 하지만,
                                                           * getStudentName(), setStudentName() 같은
                                                           * public 메서드를 통하면,
                                                           * private 변수에 접근 가능하다. 
                                                           */
      
      
      System.out.println(studentLee.getStudentName());      // getStudentName() 메서드를 통해서 
                                                            // p164_Student 클래스의 private 변수 studentName 의 값을 가져와서 출력.  

    }

}
