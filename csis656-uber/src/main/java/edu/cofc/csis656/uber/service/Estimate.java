package edu.cofc.csis656.uber.service;

public class Estimate {

	private double approximateRenterCost;
	private double approximateDriverProfit;
	private double approximateDistance;
	private double boostMultiplier;
	
	private double checkBoost(Origin orig, Destination dest) {
		return 1.2;
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in Estimate.");
    }
}
