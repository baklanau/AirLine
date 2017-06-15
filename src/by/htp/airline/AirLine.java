package by.htp.airline;

import java.util.Arrays;
import java.util.Comparator;


public class AirLine {

	private Plane[] planes;
	private String companyName;
	private int addedCount = 0;

	public AirLine(String companyName) {

		this.planes = new Plane[3];
		this.companyName = companyName;
	}

	public void addPlain(Plane plane) {
		if (addedCount < planes.length) {
			planes[addedCount] = plane;
			addedCount++;
		} else {
			Plane[] planes2 = new Plane[addedCount * 2];
			System.arraycopy(planes, 0, planes2, 0, addedCount);
			planes2[addedCount] = plane;
			addedCount++;
			planes = planes2;
		}

	}

	public Plane[] getPlanes() {
		return planes;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Plane getPlane(int index) {
		return planes[index];
	}

	public void sortByRangeOfFlight() {
		Arrays.sort(planes, 0, addedCount, Comparator.comparingInt(Plane::getRangeOfFlight));
	}

	public Object[] findByAmountOfFuel(int value) {
		return  Arrays.stream(planes, 0, addedCount).filter(plain -> plain.getAmountOfFuel() <= value).toArray();
	}
	
	
	

	@Override 
	public String toString() {
		return "AirLine{" +
				", companyName='" + companyName +
				"planes=" + Arrays.toString(planes) + '\'' +
				'}';
	}
}

