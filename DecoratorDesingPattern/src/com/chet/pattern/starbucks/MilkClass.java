package com.chet.pattern.starbucks;

public class MilkClass extends AddonBeverages {

	public MilkClass(Beverages bev) {
		super(bev);
		
	}

	@Override
	public int getCost() {
		
		return this.beverage.getCost() + 4;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Adding Milk ";
	}
}
