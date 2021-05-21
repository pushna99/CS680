package edu.umb.cs680.hw13.Multicast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulticastTest {

	PieChartObserver piechartObserver = new PieChartObserver();
	TableObserver tableObserver = new TableObserver();
	ThreeDObserver THREEDObserver = new ThreeDObserver();
	StockQuoteObservable stockMulticast = new StockQuoteObservable();
	DJIAQuoteObservable djiaMulticast = new DJIAQuoteObservable();

	@Test
	public void DJIATest() {

		djiaMulticast.addObserver(piechartObserver);
		djiaMulticast.addObserver(tableObserver);
		djiaMulticast.addObserver(THREEDObserver);
		djiaMulticast.changeQuote(100);
		djiaMulticast.changeQuote(300);
		
	}
	
	@Test
	void verifyStock() {
		
		stockMulticast.addObserver(piechartObserver);
		stockMulticast.addObserver(tableObserver);
		stockMulticast.addObserver(THREEDObserver);
		stockMulticast.changeQuote("ABC", 10);
		stockMulticast.changeQuote("AB", 30);
	
	}

}