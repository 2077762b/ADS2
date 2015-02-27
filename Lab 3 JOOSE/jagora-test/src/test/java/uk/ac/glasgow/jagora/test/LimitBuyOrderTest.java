package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.BuyOrder;
import uk.ac.glasgow.jagora.Market;
import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.Trader;
import uk.ac.glasgow.jagora.impl.LimitBuyOrder;
import static uk.ac.glasgow.jagora.test.stub.StubTrader.trader1;
import static uk.ac.glasgow.jagora.test.stub.StubStock.lemons;


public class LimitBuyOrderTest {

	private Trader trader = trader1;
	private Stock stock = lemons;
	private Integer quantity = 1000;
	private Double price = 100.00;
	
	protected BuyOrder buyOrder; 
	
	@Before
	public void setUp() throws Exception {
		this.buyOrder = new LimitBuyOrder(trader,stock,quantity,price);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
