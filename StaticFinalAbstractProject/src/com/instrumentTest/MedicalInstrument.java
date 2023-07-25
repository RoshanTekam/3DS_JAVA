package com.instrumentTest;

abstract class MedicalInstrument implements Instrument {
	abstract void treatment();

}

abstract class SurgicalBasedMedicalInstrument extends MedicalInstrument {
	abstract void woundRectractors();
}

class Surgeon extends SurgicalBasedMedicalInstrument {

	@Override
	public void use() {
		System.out.println("Using ....");

	}

	@Override
	void woundRectractors() {
		System.out.println("Surgical Instrument...");

	}

	@Override
	void treatment() {
		System.out.println("Treatment done...");

	}

}