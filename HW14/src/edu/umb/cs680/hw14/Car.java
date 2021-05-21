package edu.umb.cs680.hw14;

import java.util.ArrayList;

public class Car {
	private String make;
    private String model;
    private int mileage;
    private int year;
    private int dominationCount;
    private float price;
    
    public Car(String make, String model, int mileage, int year,  float price) {
    	this.make = make;
    	this.model = model;
    	this.mileage = mileage;
    	this.year = year;
    	this.price = price;
    }

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMileage() {
		return mileage;
	}

	public int getYear() {
		return year;
	}

	public float getPrice() {
		return price;
	}
	
	 public void setDominationCount(ArrayList<Car> cars) {
	        int count = 0;
	        for (Car car : cars) {
	            if (!car.equals(this)) {
                if ((this.getYear() >= car.getYear()) && (this.getMileage() <= car.getMileage()) && (this.getPrice() <= car.getPrice())) {
	                    if ((this.getYear() > car.getYear()) || (this.getMileage() < car.getMileage()) || (this.getPrice() < car.getPrice())) {
	                        count++;
	                    }
	                }
	            }
	        }
	        this.dominationCount = count;
	    }
	 
	 public int getDominationCount() {
			return this.dominationCount;
		}
	
	
}