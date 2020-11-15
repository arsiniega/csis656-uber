package edu.cofc.csis656.uber.service;

public class RenterEstimate extends Estimate{
	
	private double getRenterCost() {
		return 2.0;
	}
	
	private double getArrivalTime() {
		return 1.0;
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in RenterEstimate.");
    }
}
