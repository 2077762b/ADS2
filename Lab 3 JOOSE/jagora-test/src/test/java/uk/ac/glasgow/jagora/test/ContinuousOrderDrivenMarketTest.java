package uk.ac.glasgow.jagora.test;
import static uk.ac.glasgow.jagora.test.stub.StubWorld.world1;
import static org.junit.Assert.*;
import static uk.ac.glasgow.jagora.test.stub.StubStock.lemons;
import static uk.ac.glasgow.jagora.test.stub.StubOrderBook.orderBook1;
import static uk.ac.glasgow.jagora.test.stub.StubOrderBook.orderBook2;
import uk.ac.glasgow.jagora.BuyOrder;
import uk.ac.glasgow.jagora.Market;
import uk.ac.glasgow.jagora.OrderBook;
import uk.ac.glasgow.jagora.SellOrder;
import uk.ac.glasgow.jagora.World;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.impl.ContinuousOrderDrivenMarket;

public class ContinuousOrderDrivenMarketTest {
	
	protected Stock stock = lemons;
	protected World world = world1;
	protected OrderBook<SellOrder> sellBook = orderBook1;
	protected OrderBook<BuyOrder> buyBook = orderBook2;
	
	protected Market market;
	
	@Before
	public void setUp() throws Exception {
		this.market = new ContinuousOrderDrivenMarket(lemons,world1);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
