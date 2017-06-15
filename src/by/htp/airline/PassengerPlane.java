package by.htp.airline;

public class PassengerPlane extends Plane {

	private int numberOfPassengers;

	public PassengerPlane(int aircraftNumber, int rangeOfFlight, int amountOfFuel, int numberOfPassengers) {
		super(aircraftNumber, rangeOfFlight, amountOfFuel);
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	@Override 
	public String toString() {
		return "PassengerPlane{" +
				super.toString() +
				"numberOfPassengers=" + numberOfPassengers +
				'}';
	}
}
