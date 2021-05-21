package edu.umb.cs680.hw13.Multicast;

import java.util.LinkedList;

public class DJIAQuoteObservable {
	public LinkedList<DJIAQuoteObserver> observer = new LinkedList<DJIAQuoteObserver>();
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

	public void notifyObservers(DJIAEvent o1) {
		if (hasChanged()) {
			for (DJIAQuoteObserver DJIA: this.observer) {
				DJIA.updateDJIA(o1);
			}
			clearChanged();
		}
	}
	public void addObserver(DJIAQuoteObserver observer) {
		this.observer.add(observer);
	}
	
	public void changeQuote(float q) {
		setChanged();
		notifyObservers(new DJIAEvent(q));
	}

}