package chapter_06;

public class p178_TakeTrans {

    public static void main(String[] args) {
        
        p175_Student studentJames = new p175_Student("James", 5000);
        p175_Student studentTomas = new p175_Student("Tomas", 10000);
        
        p177_Bus bus100 = new p177_Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo();
        bus100.showInfo();

        System.out.println();
        
        p177_Subway subwayGreen = new p177_Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();
        
    }

}
