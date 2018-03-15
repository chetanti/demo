package com.chet.pattern.decoratorpattern.drinks;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar() {
		// TODO Auto-generated constructor stub
	}
	
	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.println(" Adding Feature of Luxury Car");
	}
}
