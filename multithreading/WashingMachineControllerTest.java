package com.multithreading;

public class WashingMachineControllerTest {
	public static void main(String[] args) {

		WashingPowder washingPowder = new WashingPowder(10, "Nirma", 50);
		Water water = new Water(20, "cold");
		Electricity electricity = new Electricity(10, 20);

		Cloth[] clothArr = new Cloth[3];
		clothArr[0] = new Cloth("RED", 150, false);
		clothArr[1] = new Cloth("WHITE", 250, false);
		clothArr[2] = new Cloth("BLUE", 100, true);

		WashingMachine machineObj1 = new WashingMachine(washingPowder, water, electricity, clothArr);
		WashingMachine machineObj2 = new WashingMachine(washingPowder, water, electricity, clothArr);
		WashingMachine machineObj3 = new WashingMachine(washingPowder, water, electricity, clothArr);

		machineObj1.startWash();
//		System.out.println(laundry1.toString());

//		Laundry laundry2 = machineObj2.startWash();
//		System.out.println(laundry2.toString());
//		
//		Laundry laundry3 = machineObj3.startWash();
//		System.out.println(laundry3.toString());
	}

}

class ClothNotFoundException extends Exception {
	ClothNotFoundException(String msg) {
		super(msg);
	}
}

abstract class Machine implements Runnable {
	public void run() {
	}

}

class WashingMachine extends Machine {
	private Thread t;
	WashingPowder powder;
	Water water;
	Electricity electricity;
	Cloth cloth[];
	Laundry laundry = new Laundry(0, 0, 0);

	public WashingMachine(WashingPowder powder, Water water, Electricity electricity, Cloth[] cloth) {
		super();

		this.powder = powder;
		this.water = water;
		this.electricity = electricity;
		this.cloth = cloth;
		t = new Thread(this);
	}

	public void run() {

		try {
		    laundry=	wash(powder, water, electricity, cloth);
			System.out.println(laundry.toString());

		} catch (ClothNotFoundException e) {
			e.printStackTrace();
		}
	}

	Laundry wash(WashingPowder powder, Water water, Electricity electricity, Cloth cloth[]) throws ClothNotFoundException {

		if (cloth.length > 0) {
			laundry.setNumberOfCloths(cloth.length);
			laundry.setTimeRequired(120f);
			laundry.setTotalCost(600);

		} else {
			throw new ClothNotFoundException("Hey there is not a sigle cloth ...");
		}
//		System.out.println("Washing powder : " + powder.toString());
		return laundry;
	}

	public void startWash() {
		t.start();
	}

}

class Laundry {
	private int numberOfCloths;
	private float timeRequired;
	private float totalCost;

	public Laundry(int numberOfCloths, float timeRequired, float totalCost) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + "]";
	}

}

class Powder {

}

class WashingPowder extends Powder {
	private int quantity;
	private String type;
	private float price;

	public WashingPowder(int quantity, String type, float price) {
		super();
		this.quantity = quantity;
		this.type = type;
		this.price = price;
	}

}

class Water {
	private int quantity;
	private String temperature;

	public Water(int quantity, String temperature) {
		super();
		this.quantity = quantity;
		this.temperature = temperature;
	}

}

class Electricity {
	private int costPerUnit;
	private int unitUsed;

	public Electricity(int costPerUnit, int unitUsed) {
		super();
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
	}

}

class Cloth {
	private String color;
	private float cost;
	private boolean clean;

	public Cloth(String color, float cost, boolean clean) {
		super();
		this.color = color;
		this.cost = cost;
		this.clean = clean;
	}

}