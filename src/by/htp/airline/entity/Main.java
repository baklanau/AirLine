package by.htp.airline.entity;

import by.htp.airline.AirLine;
import by.htp.airline.AviaStatist;
import by.htp.airline.CountResult;
import by.htp.airline.LandPlane;
import by.htp.airline.PassengerPlane;
import by.htp.airline.Plane;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

		Plane Plain1 = new PassengerPlane(1, 2700, 2000, 123);
		Plane Plain2 = new PassengerPlane(2, 2800, 3000, 223);

		Plane Plain3 = new LandPlane(3, 9000, 10000, 50000);
		Plane Plain4 = new LandPlane(4, 1000, 11000, 60000);

		AirLine aircraft = new AirLine("Belavia");
		aircraft.addPlain(Plain2);
		aircraft.addPlain(Plain4);
		aircraft.addPlain(Plain1);
		aircraft.addPlain(Plain3);

		Plane Plain5 = new PassengerPlane(1, 3700, 3000, 223);
		Plane Plain6 = new PassengerPlane(2, 3800, 4000, 323);

		Plane Plain7 = new LandPlane(3, 10000, 20000, 60000);
		Plane Plain8 = new LandPlane(4, 2000, 21000, 70000);

		AirLine aircraft2 = new AirLine("Lufthansa");
		aircraft2.addPlain(Plain5);
		aircraft2.addPlain(Plain6);
		aircraft2.addPlain(Plain7);
		aircraft2.addPlain(Plain8);

		//int passengersCount = 0;
		//int capacity = 0;
		//Plane plane;

		/*for (int i = 0; i < aircraft.getPlanes().length; i++) {
			plane = aircraft.getPlane(i);
			if (plane instanceof PassengerPlane) {
				passengersCount += ((PassengerPlane) plane).getNumberOfPassengers();
			}
			if (plane instanceof LandPlane) {
				capacity += ((LandPlane) plane).getLoadCapacity();
			}
		}*/
		
		AviaStatist as = new AviaStatist();
		
		CountResult cr = as.calculateParametr(aircraft);
		CountResult cr2 = as.calculateParametr(aircraft2);

		System.out.println("Passengers count:" + cr.getPassengersCount());
		System.out.println("Capacity:" + cr.getCapacity());
		System.out.println(aircraft);
		System.out.println();

		aircraft.sortByRangeOfFlight();
		System.out.println(aircraft);
		System.out.println();

		System.out.println(Arrays.toString(aircraft.findByAmountOfFuel(2000)));
		
		
		System.out.println("Passengers count:" + cr2.getPassengersCount());
		System.out.println("Capacity:" + cr2.getCapacity());
		System.out.println(aircraft2);
		System.out.println();

		aircraft.sortByRangeOfFlight();
		System.out.println(aircraft2);
		System.out.println();

		System.out.println(Arrays.toString(aircraft2.findByAmountOfFuel(2000)));

	}

}
