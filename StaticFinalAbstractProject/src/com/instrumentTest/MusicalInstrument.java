package com.instrumentTest;

abstract class MusicalInstrument implements Instrument {
	abstract void play();
}

abstract class StringBaseMusicalInstrument extends MusicalInstrument {
	abstract void tuneStrings();
}

class Guitar extends StringBaseMusicalInstrument {
	public void use() {
		System.out.println("Using Guitar...");
	}

	public void play() {
		System.out.println("Playing Guitar...");
	}

	public void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");
	}

	public void pluck() {
		System.out.println("Plucking Strings of Guitar...");
	}
}

class Violin extends StringBaseMusicalInstrument {
	public void use() {
		System.out.println("Using Violin...");
	}

	public void play() {
		System.out.println("Playing Violin...");
	}

	public void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");
	}

	public void bow() {
		System.out.println("Bowing Strings of Violin...");
	}

}
