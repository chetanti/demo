package com.chet.pattern.drinks;

public class BasicCar implements Car{

	@Override
	public void assemble() {
		System.out.println(" Basic Car");
		
	}

}
/*
The basic implementation of the component interface. We can have BasicCar class as our component implementation.*/