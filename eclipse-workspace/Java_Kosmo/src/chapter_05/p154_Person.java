package chapter_05;

public class p154_Person {      // + p155 포함. 
    
    
    /*
     * <디폴트 생성자>
     * 
     * 생성자는 클래스를 생성할때 호출.
     * 
     * 생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없다.
     * 
     * 생성자가 없는 클래스는 클래스 파일을 컴파일 할 때,
     * 자바컴파일러에서 자동으로 생성자를 만들어준다. 
     * 
     * 자동으로 만들어주는 생성자 = 디폴트 생성자(default constructor)
     * 
     * 디폴트 생성자는 매개변수, 구현코드가 없다.
     *
     */
    
    String name;            // String 형 변수 name 선언      //멤버변수
    float height;           // float 형 변수 height 선언     //멤버변수
    float weight;           // float 형 변수 weight 선언     //멤버변수
    
    
    public p154_Person() {}     // 디폴트 생성자 직접 추가
    
    public p154_Person(String pname) {      // 사람이름을 매개변수로 입력받아서 Person클래스를 생성하는 생성자
                                            // String형 매개변수 pname 지정.
                                            // 컴파일 순간 p155_PersonTest.java에서 오류가 발생.
       
        name = pname;                       // pname을 매개변수로 입력받아 변수 name에 대입.
        
        /*
         * <생성자 만들기>
         * 필요한 경우 직접 생성자 구현 가능.
         * 
         * 생성자는 멤버변수에 대한 값들을 매개변수로 받아서,
         * 인스턴스가 새로 생성될 때, 멤버변수 값들을 초기화하는 역할을 한다.
         * 
         * 인스턴스가 생성 => 멤버변수의 값을 지정.
         * 인스턴스를 초기화 하기 위해 생성자를 직접 구현. 
         */
    
    }
}
