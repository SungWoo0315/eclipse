package chapter_05;

public class p158_PersonTest {

    public static void main(String[] args) {        /*
                                                     * 생성자의 역할은,
                                                     * 
                                                     * 인스턴스 변수의 초기화.  
                                                     * 
                                                     * 여러가지 생성자를 제공하면,
                                                     * 
                                                     * 이 클래스를 사용하여 인스턴스를 만드는 경우,
                                                     * 
                                                     * 필요한 생성자를 골라서 사용 가능. 
                                                     */
        
        // p157_Person 클래스를 사용하는 p158_PersonTest 클래스에서 구현.
        
        
        p157_Person personKim = new p157_Person( );
        
        personKim.name = "김유신";
        
        personKim.weight = 85.5F;
                
        personKim.height = 180.0F;
        
        
        
        
        p157_Person personLee = new p157_Person("이순신", 175, 75);
        
        
        
        
        System.out.println("name값 확인 : " + personKim.name + " / " + personLee.name);
        System.out.println("weight값 확인 : " +personKim.weight + " / " + personLee.weight);
    }

}
