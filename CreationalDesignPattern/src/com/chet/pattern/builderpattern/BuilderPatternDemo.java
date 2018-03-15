package com.chet.pattern.builderpattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealbuilder = new MealBuilder();
		
		Meal vegMeal = mealbuilder.vegMeal();
		System.out.println("Prepared Veg Meal is ");
		
		vegMeal.showItems();
		System.out.println(" total cost is " + vegMeal.getCost());
		
		Meal nonVegMeal = mealbuilder.nonVegMeal();
		
		System.out.println(" Prepared Non Veg Meal is ");
		nonVegMeal.showItems();
		
		System.out.println(" Total cost is " + nonVegMeal.getCost());
	}

}
