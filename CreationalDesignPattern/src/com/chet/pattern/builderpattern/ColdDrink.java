package com.chet.pattern.builderpattern;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name() ;

	@Override
	public Packing packing() {
		return new Bottler();
	}

	@Override
	public abstract float price() ;

}
