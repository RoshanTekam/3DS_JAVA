package com.instrumentTest;

abstract class ElectronicInstrument implements Instrument {
	abstract void test();

}

abstract class SmartElectronics extends ElectronicInstrument {
	abstract void smartFeature();

}

class SmartCars extends SmartElectronics {
	@Override
	public void use() {
		System.out.println("Using Car...");

	}

	@Override
	void smartFeature() {
		System.out.println("Automatic run ...");

	}

	@Override
	void test() {
		System.out.println("Smart Car Testing...");
	}

	public void color() {
		System.out.println("Color of the Car : " + " White");
	}

}

class AutomatedDoors extends SmartElectronics {

	@Override
	public void use() {
		System.out.println("Using automated doors...");

	}

	@Override
	void smartFeature() {
		System.out.println("Does'n need to open by hand...");

	}

	@Override
	void test() {
		System.out.println("Testing smartElectronics...");
	}

}
