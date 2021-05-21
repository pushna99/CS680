package edu.umb.cs680.hw13.Multicast;

import java.util.ArrayList;

public class StockQuoteObservable {
	public ArrayList<StockQuoteObserver> observers = new ArrayList<StockQuoteObserver>();
	private boolean changed;
	
	
	public void setChanged() {
		this.changed = true;
	}

	public boolean hasChanged() {
		return this.changed;
	}

	public void clearChanged() {
		this.changed = false;
	}
	public void addObserver(StockQuoteObserver observer) {
		this.observers.add(observer);
	}

	public void notifyObservers(StockEvent args) {
		if (hasChanged()) {
			for (StockQuoteObserver stock : this.observers) {
				stock.updateStock(args);
			}
			clearChanged();
		}
	}
	

	public void changeQuote(String t, float q) {
		setChanged();
		notifyObservers(new StockEvent(t, q));
	}

}