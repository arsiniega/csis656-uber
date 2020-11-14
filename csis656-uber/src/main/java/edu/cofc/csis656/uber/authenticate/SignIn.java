package edu.cofc.csis656.uber.authenticate;

import edu.cofc.csis656.uber.Renter;

public class SignIn {
	
	private Renter renterID;
	private double SignInSession;
	
	private boolean validatePaymentMethods() {
		return false;
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in SignIn.");
    }

}
