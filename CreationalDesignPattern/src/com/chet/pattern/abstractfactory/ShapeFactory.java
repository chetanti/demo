package com.chet.pattern.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}else if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
			
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
