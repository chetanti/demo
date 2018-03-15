package com.chet.pattern.bridgepattern;

public abstract class Shape {

	protected DrawAPI drawApi;
	
	protected Shape(DrawAPI api) {
		this.drawApi = api;
	}
	
	public abstract void draw();
}
