package com.chet.pattern.decoratorpattern.drinks;

public class CarDecorator implements Car{

	protected Car car;

	public CarDecorator() {
		// TODO Auto-generated constructor stub
	}
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	@Override
	public void assemble() {
		
		this.car.assemble();
	}
	
}
