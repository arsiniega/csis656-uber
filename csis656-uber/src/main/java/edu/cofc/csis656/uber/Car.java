package edu.cofc.csis656.uber;

public class Car {
	
	public String Make;
	public String Model;
	public String Year;
	public String VIN;
	
	public Car(String make, String model, String year, String vIN) {
		super();
		Make = make;
		Model = model;
		Year = year;
		VIN = vIN;
	}
	
	@Override
	public String toString() {
		return "Car [Make=" + Make + ", Model=" + Model + ", Year=" + Year + ", VIN=" + VIN + "]";
	}
	
	

}
