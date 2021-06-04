package ch10_4_0604;

public interface Buy {
	void buy();
	
	
	
	default void order(){
		System.out.println("구매주문");
	}



}
