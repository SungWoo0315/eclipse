package ch10_4_0604;

public interface Sell {
	void sell();
	
	
	
	default void order(){
		System.out.println("판매주문");
	}
}
