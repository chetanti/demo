package com.chet.pattern.starbucks;

public class Decaf extends Beverages {

	@Override
	public int getCost() {

		return 3;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + "Plus Decaf Coffee ";
	}
}
