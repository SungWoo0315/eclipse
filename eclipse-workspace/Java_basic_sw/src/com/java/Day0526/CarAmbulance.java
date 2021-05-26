package com.java.Day0526;

public class CarAmbulance extends Car {
	
	String kit;
	
	public CarAmbulance(String carname, int cc, String kit) {
		this.name = "엠뷸런스";
	
	}
	
	public void siren() {
		System.out.println("사이렌이 울립니다.");
	}
}
