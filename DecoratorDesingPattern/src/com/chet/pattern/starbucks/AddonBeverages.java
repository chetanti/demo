package com.chet.pattern.starbucks;

public abstract class AddonBeverages extends Beverages {

	protected Beverages beverage;
	
	public abstract int getCost() ;
	
	public AddonBeverages(Beverages bev) {
		this.beverage = bev;
	}

}
