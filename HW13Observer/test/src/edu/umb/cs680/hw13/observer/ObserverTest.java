package edu.umb.cs680.hw13.observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw13.observer.DJIAQuoteObservable;
import edu.umb.cs680.hw13.observer.PieChartObserver;
import edu.umb.cs680.hw13.observer.StockQuoteObservable;
import edu.umb.cs680.hw13.observer.ThreeDObserver;



class ObserverTest {

	PieChartObserver PiechartObserver = new PieChartObserver();
	PieChartObserver TableObserver = new PieChartObserver();
	ThreeDObserver THREEDObserver = new ThreeDObserver();
	DJIAQuoteObservable djiaObserver = new DJIAQuoteObservable();
	StockQuoteObservable stockObserver = new StockQuoteObservable();
	
		@SuppressWarnings("deprecation")
		@Test
		void verifyDija() {
			
			djiaObserver.addObserver(PiechartObserver);
			djiaObserver.addObserver(TableObserver);
			djiaObserver.addObserver(THREEDObserver);

			djiaObserver.changeQuote(10);
			djiaObserver.changeQuote(30);
		}
		
		@SuppressWarnings("deprecation")
		@Test
		void verifyStock() {
			stockObserver.addObserver(PiechartObserver);
			stockObserver.addObserver(TableObserver);
			stockObserver.addObserver(THREEDObserver);

			stockObserver.changeQuote("AB",10);
			stockObserver.changeQuote("XY",30);
			
		}
		
}