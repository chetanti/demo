package com.chet.pattern.commandpattern;

public class SellStock implements Order {

	private StockRequest abcStock;
	
	public SellStock(StockRequest stock) {
		this.abcStock = stock;
	}
	@Override
	public void execute() {

		abcStock.sell();
	}

}
