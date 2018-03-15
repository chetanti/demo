package com.chet.pattern.decoratorpattern.starbucks;

public class Espresso extends Beverages{

	@Override
	public int getCost() {
		return 2;
	}

	@Override
	public String getDescription() {
		
		return super.getDescription() + " Plus Espresso ";
	}
	
}
