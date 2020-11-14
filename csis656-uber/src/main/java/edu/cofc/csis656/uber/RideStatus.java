package edu.cofc.csis656.uber;

public enum RideStatus {
	InProgress,
	NotStarted,
	Finished,
	Errored;
	
	boolean getActiveRideStatus() {
		switch (this) {
		case InProgress:
			return true;
		default:
			return false;
		}
	}
}
