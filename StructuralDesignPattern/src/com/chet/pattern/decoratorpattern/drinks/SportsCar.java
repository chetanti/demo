package com.chet.pattern.decoratorpattern.drinks;

public class SportsCar extends CarDecorator {

	public SportsCar() {
		// TODO Auto-generated constructor stub
	}
	
	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.println(" Adding features of Sports Car");
	}
	
}
