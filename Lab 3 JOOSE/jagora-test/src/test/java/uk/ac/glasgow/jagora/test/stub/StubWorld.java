package uk.ac.glasgow.jagora.test.stub;

import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.Trader;
import uk.ac.glasgow.jagora.World;
import static uk.ac.glasgow.jagora.test.stub.StubTickEvent.tickEvent1;

public class StubWorld implements World {
	
	public static final World world1 = new StubWorld ();

	@Override
	public <T> TickEvent<T> createTickEvent(T event) {
		return tickEvent1;
	}
	
}
