package chapter_05;

public class p157_Person {     
    

    String name;            // String 형 변수 name 선언      //멤버변수
    float height;           // float 형 변수 height 선언     //멤버변수
    float weight;           // float 형 변수 weight 선언     //멤버변수
     
    public p157_Person( ) { }     // 디폴트 생성자 직접 추가
    
    public p157_Person(String pname) {      // 사람이름을 매개변수로 입력받아서 Person클래스를 생성하는 생성자
                                            // String형 매개변수 pname 지정.
       
        name = pname;                       // pname을 매개변수로 입력받아 변수 name에 대입. 
    }

    public p157_Person(String pname, float pheight, float pweight){     // 이름, 키, 몸무게를 매개변수로 입력받는 생성자.
        
        name = pname;               // 
        
        height = pheight;
        
        weight = pweight;
    }


}
