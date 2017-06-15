package by.htp.airline;

public class LandPlane extends Plane {

	private int loadCapacity;

	public LandPlane(int aircraftNumber, int rangeOfFlight, int amountOfFuel, int loadCapacity) {
		super(aircraftNumber, rangeOfFlight, amountOfFuel);
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	@Override 
	public String toString() {
		return "LandPlane{" +
				super.toString() +
				"loadCapacity=" + loadCapacity +
				'}';
	}
}
