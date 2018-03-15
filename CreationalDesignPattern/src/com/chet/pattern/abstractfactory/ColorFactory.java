package com.chet.pattern.abstractfactory;

public class ColorFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		
		return null;
	}

	@Override
	Color getColor(String color) {
		if(color == null) {
			return null;
		}else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
			
		}else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		return null;
	}
}
