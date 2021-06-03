package ch08_1_6_0603;

public class VideoPhone extends Phone {

	// defualt 생성자가 상속하는 쪽에 있으면
	// super();
	
	// 상속 클래스가 매개변수 생성자가 있으면 
	// super(매개변수) 호출 꼭 해줘야함.
	public VideoPhone() {
		 super("","","");
	}
	
	
	public VideoPhone(String m, String c, String n) {
		super(m, c, n);
		
	
		
	}
	
	
	public void videoCall() {
		System.out.println("영상통화");
	}
	
	public void info() {
		
		String a = super.model;
	}
	
	
}
