package com.chet.pattern.decoratorpattern.starbucks;

public class Chocolate extends AddonBeverages {

	public Chocolate(Beverages bev) {
		super(bev);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() + 6;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Adding Chocolate";
	}
}
