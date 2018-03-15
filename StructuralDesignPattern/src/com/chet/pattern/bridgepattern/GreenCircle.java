package com.chet.pattern.bridgepattern;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println(" Drawing Circle [Color: Green, radius :  " + radius + " , x : " + x + " , y :" + y + " ]");
	}

}
