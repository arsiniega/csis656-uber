package edu.cofc.csis656.uber.service;

public class ServiceType {

	private double carClassMultiplier;
	
	private boolean isUberXLAvailable(float OriginGeocode) {
		return false;
	}
	
	private boolean isUberRideShare(float OriginGeocode) {
		return false;
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in ServiceType.");
    }
}
