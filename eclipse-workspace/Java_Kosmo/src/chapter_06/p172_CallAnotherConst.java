package chapter_06;
    
    /*
     * <생성자에서 다른생성자를 호출하는 this>
     * 
     * 클래스에 생성자가 여러개 있을 경우,
     * 생성자에서 다른 생성자를 호출하는 경우가 있다.
     * 
     * 이때 this 를 사용해 클래스의 생성자에서 다른 생성자를 호출 할 수 있다.
     * 
     */

class Person {      // Person 클래스.
                    // Person 클래스에 
                    // Person() 디폴트 생성자, 
                    // 매개변수를 가지는 Person(String, int) 생성자가 있다.
   
    String name;    // String형 변수 name 선언.
    int age;        // int 형 변수 age 선언.
    
    Person() {      // 디폴트 생성자.
        
        //this.name = "noname";     
        
        /*
         * this 로 다른 생성자 호출 시,
         * 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없다.
         * 위와 같이 다른 코드를 넣으면 오류가 난다.  
         */
        
        /*
         * 생성자는 클래스가 생성될 때 호출된다.
         * 클래스 생성이 완료되지 않은 시점에 다른 코드가 있으면 오류 발생.
         * 디폴트 생성자에서 생성이 완료되는것이 아니라 
         * this 를 사용해 다른 생성자 호출하는 형태이므로. 
         * this를 활용한 다른생성자 호출이 먼저 와야한다.
         */
        
        this("이름없음", 1);        // this를 사용해 Person(String, int) 생성자 호출
    }
    
    Person(String name, int age){       // 매개변수를 가지는 생성자.
        this.name = name;
        this.age = age;
    }
}


public class p172_CallAnotherConst {

    public static void main(String[] args) {
        
        Person noName = new Person();
        
        System.out.println(noName.name);
        System.out.println(noName.age);
        
    }

}
