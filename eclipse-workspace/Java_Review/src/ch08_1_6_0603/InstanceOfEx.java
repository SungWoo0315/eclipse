package ch08_1_6_0603;

public class InstanceOfEx {

	public static void main(String[] args) {

		Phone phone1 = new VideoPhone();
		if( phone1 instanceof VideoPhone) {
			System.out.println("phone1 OK Videophone");
		}
		
		// phone1.videCall();
		((VideoPhone)phone1).videoCall();
		
		if( phone1 instanceof Phone) {
			System.out.println("phone1 OK Phone");
		}
		
		
		VideoPhone phone3 = new VideoPhone();
		if( phone3 instanceof Phone) {
			System.out.println("phone3 OK Phone");
		}
		
		
		
		Phone phone2 = new Phone("", "", "");
		if (phone2 instanceof VideoPhone) {
			System.out.println("phone2 OK Videophone");
		}
//		((VideoPhone)phone2).videoCall();// compile time x
		
		if( phone2 instanceof Phone) {
			System.out.println("phone2 OK Phone");
		{
	}

}
}
}
