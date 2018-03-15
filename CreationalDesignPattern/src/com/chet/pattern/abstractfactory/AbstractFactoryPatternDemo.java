package com.chet.pattern.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape = shapeFactory.getShape("CIRCLE");
		
		shape.draw();
	}

}
