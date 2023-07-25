package com.instrumentTest;

public class InstrumentTestController {

	public static void main(String[] args) {

		// Musical Instrument implementation
		System.out.println("_______Musical Instrument_______");
		Guitar guitar = new Guitar();
		guitar.use();
		guitar.play();
		guitar.tuneStrings();
		guitar.pluck();
		System.out.println("______________");
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();

		System.out.println("_______Electornics Instrument_______");

		// Electornics instrument implementation
		SmartCars cars = new SmartCars();
		cars.use();
		cars.test();
		cars.smartFeature();
		cars.color();
		AutomatedDoors automatedDoors = new AutomatedDoors();
		automatedDoors.use();
		automatedDoors.test();
		automatedDoors.smartFeature();

		System.out.println("________Medical Instrument______");
		Surgeon medical = new Surgeon();
		medical.use();
		medical.treatment();
		medical.woundRectractors();

	}

}
