package uk.ac.glasgow.jagora.test.stub;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.Trade;
import uk.ac.glasgow.jagora.TradeException;
import static uk.ac.glasgow.jagora.test.stub.StubStock.lemons;

public class StubTrade implements Trade {
	
	public static final Trade trade1 = new StubTrade ();

	@Override
	public Stock getStock() {
		return lemons;
	}

	@Override
	public Integer getQuantity() {
		return 100;
	}

	@Override
	public Double getPrice() {
		return 100.00;
	}

	@Override
	public TickEvent<Trade> execute() throws TradeException {
		return null;
	}
	

}
