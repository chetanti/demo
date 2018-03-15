package com.chet.pattern.bridgepattern;

public class Circle extends Shape {

	private int x, y, radius;
	
	protected Circle(int x, int y, int radius,DrawAPI api) {
		super(api);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}

}
