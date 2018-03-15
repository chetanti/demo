package com.chet.pattern.decoratorpattern.drinks;

public class DecoratorPatternTest {

	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		
		sportsCar.assemble();
		
	
		Car mixCar = new SportsCar(new LuxuryCar(new BasicCar()));
		
		mixCar.assemble();
				
	}

}
