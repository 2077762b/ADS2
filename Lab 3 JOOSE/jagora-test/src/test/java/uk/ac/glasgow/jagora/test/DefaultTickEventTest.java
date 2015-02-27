package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;
import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.impl.DefaultTickEvent;
import uk.ac.glasgow.jagora.Trade;
import static uk.ac.glasgow.jagora.test.stub.StubTrade.trade1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultTickEventTest {
	
	protected Long tick = 100000L;
	protected Trade trade = trade1;
	
	protected TickEvent tickEvent;

	@Before
	public void setUp() throws Exception {
		this.tickEvent = new DefaultTickEvent(trade, tick);
	}

	@After
	public void tearDown() throws Exception {
		this.tickEvent = null;
	}

	@Test
	public void testGetEvent() {
		assertEquals(trade,tickEvent.getEvent());
	}
	
	@Test
	public void testGetTick() {
		assertEquals(tick,tickEvent.getTick());
	}
	
	@Test
	public void testCompareTo() {
		assertEquals(0,tickEvent.compareTo(tickEvent));	
	}
	
}
