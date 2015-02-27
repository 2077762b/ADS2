package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;
import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.Trade;
import uk.ac.glasgow.jagora.World;
import uk.ac.glasgow.jagora.impl.DefaultWorld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static uk.ac.glasgow.jagora.test.stub.StubTrade.trade1;
public class DefaultWorldTest {
	
	
	protected World world;

	@Before
	public void setUp() throws Exception {
		this.world = new DefaultWorld();
	}

	@After
	public void tearDown() throws Exception {
		world = null;
	}

	@Test
	public void test() {
		TickEvent<Trade> T = world.createTickEvent(trade1);
		assertEquals(T.getClass().getName(),"TickEvent<Trade>");
	}

}
