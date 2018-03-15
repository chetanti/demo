package com.chet.pattern.commandpattern;

public class BuyStock implements Order {

	private StockRequest abcStock;
	
	public BuyStock(StockRequest stock) {
		this.abcStock = stock;
	}
	@Override
	public void execute() {

		abcStock.buy();
	}

}
