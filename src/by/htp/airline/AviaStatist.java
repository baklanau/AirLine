package by.htp.airline;

public class AviaStatist {
	
	public CountResult calculateParametr (AirLine aircraft) {
		
		CountResult cr = new CountResult();
		Plane plane;
		
		int passengersCount = 0, capacity = 0;
		
		for (int i = 0; i < aircraft.getPlanes().length; i++) {
			plane = aircraft.getPlane(i);
			if (plane instanceof PassengerPlane) {
				passengersCount += ((PassengerPlane) plane).getNumberOfPassengers();
			}
			if (plane instanceof LandPlane) {
				capacity += ((LandPlane) plane).getLoadCapacity();
			}
		}
		cr.setCapacity(capacity);
		cr.setPassengersCount(passengersCount);
		
		
		return cr;
		
		
	}

}

