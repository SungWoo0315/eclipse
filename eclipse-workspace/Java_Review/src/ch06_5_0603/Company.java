package ch06_5_0603;

// 싱글톤 패턴 구현
public class Company {

	private static Company instance = new Company();
	
	// 기본 생성자 생성을 방지!
	private Company(){}
	
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance;
	}

}
