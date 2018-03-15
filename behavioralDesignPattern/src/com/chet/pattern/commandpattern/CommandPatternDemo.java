package com.chet.pattern.commandpattern;

public class CommandPatternDemo {

	public static void main(String[] args) {

		StockRequest abcStock = new StockRequest();
		
		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);
		
		Broker broker = new Broker();
		
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		
		broker.placeOrder();
	}

}
