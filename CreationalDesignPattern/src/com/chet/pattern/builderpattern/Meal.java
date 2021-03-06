package com.chet.pattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
		
	}
	
	public float getCost() {
		float cost = 0.0f;
		
		for(Item item:items) {
			cost = cost + item.price();
		}
		return cost;
	}
	
	public void showItems() {
		
		for(Item item : items) {
			System.out.println(" item name " + item.name());
			System.out.println(" Packing type is " + item.packing().pack());
			System.out.println(" Price of item is " + item.price());
		}
	}
}
