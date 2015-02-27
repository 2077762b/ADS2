package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;

import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.OrderBook;
import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.World;
import uk.ac.glasgow.jagora.impl.DefaultWorld;

public class DefaultOrderBookTest {
	
	protected World world = world1;
	protected Queue<TickEvent<O>> backing
	
	protected OrderBook orderBook;
	
	@Before
	public void setUp() throws Exception {
		this.orderBook = new DefaultOrderBook(world1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
