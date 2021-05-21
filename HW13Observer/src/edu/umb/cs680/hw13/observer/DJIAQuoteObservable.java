package edu.umb.cs680.hw13.observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class DJIAQuoteObservable extends Observable {

	float quote;

	 public void changeQuote(float q) {
		this.quote = q;
		setChanged();
		notifyObservers(new DJIAEvent(q));
	}
}