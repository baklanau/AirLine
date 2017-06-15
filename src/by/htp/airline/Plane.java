package by.htp.airline;

public abstract class Plane {

	private int aircraftNumber;
	private int rangeOfFlight;
	private int amountOfFuel;
	// private int numberOfPassengers 
	
	public Plane(int aircraftNumber, int rangeOfFlight, int amountOfFuel) {
		//super();
		this.aircraftNumber = aircraftNumber;
		this.rangeOfFlight = rangeOfFlight;
		this.amountOfFuel = amountOfFuel;
	}

	public int getAircraftNumber() {
		return aircraftNumber;
	}

	public int getRangeOfFlight() {
		return rangeOfFlight;
	}

	public int getAmountOfFuel() {
		return amountOfFuel;
	}

	@Override 
	public String toString() {
		return "Plane{" +
				"aircraftNumber=" + aircraftNumber +
				", rangeOfFlight=" + rangeOfFlight +
				", amountOfFuel=" + amountOfFuel +
				'}';
	}
}
