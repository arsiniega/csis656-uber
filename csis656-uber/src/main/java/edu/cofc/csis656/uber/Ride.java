package edu.cofc.csis656.uber;

/**
 * Hello world!
 *
 */
public class Ride 
{
	public Driver driverID;
	public Renter renterID;
	private RideStatus status;
	   
    private void setOrigin(float geocode) {
    	
    }
    
    private void setDestination(float geocode) {
    	
    }
    
    private void chooseServiceType() {
    	
    }
    
    public void startRide(Renter renterID) {
    	
    }
    
    public boolean acceptRide(Driver driverID) {
    	return true;
    }
    
    public static void main( String[] args )
    {
        System.out.println( "You're in Ride.");
        System.out.println( "Are we riding?"); 
        if (RideStatus.InProgress.getActiveRideStatus() == true)
        	System.out.println( "Yes we are!");
        else
        	System.out.println( "No, we aren't!");
    }
}
