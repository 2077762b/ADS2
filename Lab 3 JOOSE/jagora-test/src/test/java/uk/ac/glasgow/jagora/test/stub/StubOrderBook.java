package uk.ac.glasgow.jagora.test.stub;

import java.util.List;

import uk.ac.glasgow.jagora.Order;
import uk.ac.glasgow.jagora.OrderBook;
import uk.ac.glasgow.jagora.Trader;

public class StubOrderBook implements OrderBook {

	public static final OrderBook orderBook1 = new StubOrderBook();
	public static final OrderBook orderBook2 = new StubOrderBook();
	
	@Override
	public void recordOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order getBestOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getOrdersAsList() {
		// TODO Auto-generated method stub
		return null;
	}

}
