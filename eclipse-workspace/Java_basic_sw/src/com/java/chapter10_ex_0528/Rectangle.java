package com.java.chapter10_ex_0528;

public class Rectangle implements Drawable {
	int x1, x2, y1, y2;
	String[] colors = {"RED", "GREEN", "BLUE", "BLACK", "wHITE"};
	public Rectangle(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void draw(int color) {
		System.out.println("왼쪽 위의 좌표가 (%d, %d), " + "오른쪽 위의 좌표가 (%d, %d),"
					+ "원의 색깔이 %s인 사각형을 그립니다. \n",
					
					x1, y1, x2, y2, colors[color -1];
	}
	
	public int getX1
}
