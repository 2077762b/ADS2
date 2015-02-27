package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;
import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.impl.DefaultStock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultStockTest {
	
	protected String name = "lemons";
	
	protected Stock stock;

	@Before
	public void setUp() throws Exception {
		stock = new DefaultStock(name);
	}

	@After
	public void tearDown() throws Exception {
		stock = null;
	}

	@Test
	public void testGetName() {
		assertEquals(name,stock.getName());
	}

}
