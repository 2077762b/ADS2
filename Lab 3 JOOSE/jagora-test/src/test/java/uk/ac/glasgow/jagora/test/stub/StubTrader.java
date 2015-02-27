package uk.ac.glasgow.jagora.test.stub;

import java.util.Set;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.StockExchange;
import uk.ac.glasgow.jagora.TradeException;
import uk.ac.glasgow.jagora.Trader;

public class StubTrader implements Trader {
	
	public static final Trader trader1 = new StubTrader ();

	@Override
	public String getName() {
		return "Trader1";
	}

	@Override
	public Double getCash() {
		return 100.00;
	}

	@Override
	public void sellStock(Stock stock, Integer quantity, Double price)
			throws TradeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyStock(Stock stock, Integer quantity, Double price)
			throws TradeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getInventoryHolding(Stock stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void speak(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Stock> getTradingStocks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
