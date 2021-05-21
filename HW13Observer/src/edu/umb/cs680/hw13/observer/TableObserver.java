package edu.umb.cs680.hw13.observer;

import java.util.Observable;

import java.util.Observer;

@SuppressWarnings("deprecation")
public class TableObserver implements Observer {

	
	public void update(Observable o, Object o1) {
		if (o1 instanceof StockEvent) {
			StockEvent stockEvent = (StockEvent) o1;
			System.out.print("3D of StockEvent: " + stockEvent.getTicker() + " " + stockEvent.getQuote());
		} else if (o1 instanceof DJIAEvent) {
			DJIAEvent djiaEvent = (DJIAEvent) o1;
			System.out.print("3D of DJIAEvent: " + djiaEvent.getDjia());
		}
	}

}