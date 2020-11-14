package edu.cofc.csis656.uber;

public class Driver extends User{
	
	public String DriverName;
	
	private double DriverId;
	
	public boolean isVerified;
	
	private AutoInfo driverInformation;
	
	private boolean authenticateDriver() {
		System.out.println("You're in authenticateDriver method");
		return true;
	}
	
	private void lookupRidePopup() {
		System.out.println("You're in lookupRidePopup method");
	}
	
	private void addAutoInfo() {
		System.out.println("You're in addAutoInfo method");
	}
	
	public static void main(String[] args) {
		System.out.println("You're in Driver");
	}
}
