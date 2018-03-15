package com.chet.pattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		Shape circle = sf.getShape("CIRCLE");
		circle.draw();
		
		Shape square = sf.getShape("SQUARE");
		square.draw();
		
		Shape rectangle  = sf.getShape("RECTANGLE");
		
		rectangle.draw();
		
	}
}
