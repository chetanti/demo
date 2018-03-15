package com.chet.pattern.starbucks;

public class Caramel extends AddonBeverages {

	public Caramel(Beverages bev) {
		super(bev);
		
	}

	@Override
	public int getCost() {
		
	return this.beverage.getCost() + 5 ;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + "Adding Caramel";
	}
}
