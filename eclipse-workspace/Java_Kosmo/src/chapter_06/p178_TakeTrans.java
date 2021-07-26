package chapter_06;

public class p178_TakeTrans {

    public static void main(String[] args) {
        
        p175_Student studentJames = new p175_Student("James", 5000);        // 학생 studentJames 인스턴스 생성.
                                                                            // 이름 James 가진돈 5000 으로 초기화.
        
        p175_Student studentTomas = new p175_Student("Tomas", 10000);       // 학생 studentTomas 인스턴스 생성.
                                                                            // 이름 Tomas 가진돈 10000 으로 초기화.   
        
        p177_Bus bus100 = new p177_Bus(100);                       // 버스 bus100 인스턴스 생성.
        
        studentJames.takeBus(bus100);                              // takeBus() 메서드 실행.
        
        studentJames.showInfo();                                   // showInfo() 메서드 실행.
                                                                   // studentJames 의 정보 출력.
        
        bus100.showInfo();                                         // bus100 의 정보 출력.

        System.out.println();                                      // 한줄 띄우기.
        
        p177_Subway subwayGreen = new p177_Subway("2호선");        // 지하철 subwayGreen 인스턴스 생성.
       
        studentTomas.takeSubway(subwayGreen);                      // takeSubway() 메서드 실행.
      
        studentTomas.showInfo();                                   // showInfo() 메서드 실행
                                                                   // studentTomas 의 정보 출력.
       
        subwayGreen.showInfo();                                    // subwayGreen 의 정보 출력. 
        
    }

}
