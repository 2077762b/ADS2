package uk.ac.glasgow.jagora.test.stub;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.Trade;

public class StubTickEvent<Trade> implements TickEvent<Trade> {
	
	public static final TickEvent tickEvent1 = new StubTickEvent ();

	@Override
	public Object getEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getTick() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(TickEvent<Trade> o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
	
	
	

