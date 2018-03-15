package com.chet.pattern.decoratorpattern.starbucks;

public class DecoratorPatternCoffeeTest {

	public static void main(String[] args) {

		Beverages bev = new Espresso();
		
		System.out.println(bev.getCost());
		
		System.out.println(bev.getDescription());
		
		Beverages espmilk = new MilkClass(new Espresso());
		
		System.out.println(espmilk.getCost());
		System.out.println(espmilk.getDescription());

		Beverages espmilkchoco = new MilkClass(new Chocolate(new Espresso()));
		
		System.out.println(espmilkchoco.getCost());
		System.out.println(espmilkchoco.getDescription());
	}

}
