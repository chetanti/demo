package com.chet.pattern.bridgepattern;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println(" Drawing Circle [Color: Red, radius :  " + radius + " , x : " + x + " , y :" + y + " ]");
	}

}
