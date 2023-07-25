package com.washingMachiene;

public class WashingMahcineController {

	public static void main(String[] args) {
		WashingPowder washPowder = new WashingPowder(100, "Nirma", "Front Load", true, 10.0f);
		WashingTub tub = new WashingTub(20, "steel");
		Water water = new Water("cold", 40, "30 degree");
		Electricity electricity = new Electricity(10, 100);
		Cloth[] clothArr = new Cloth[3];
		clothArr[0] = new Cloth("red", 45, false);
		clothArr[1] = new Cloth("black", 55, true);
		clothArr[2] = new Cloth("wahite", 60, false);

		WashingMachine machine = new WashingMachine();
		machine.wash(washPowder, tub, water, electricity, clothArr);

		System.out.println("wash powder : " + washPowder); // toString is invoked

	}

}

class Machine {

}

class WashingMachine extends Machine { // isA

//	WashingTub washingTub=new WashingTub(20, "steel"); // hasA

	Laundry wash(WashingPowder washPowder, WashingTub tub, Water water, Electricity elect, Cloth cloth[]) {
		
		int numberOfCloths=cloth.length;
		float costOfWashingPowder=  (washPowder.getQuantity()/washPowder.getPrice());
		System.out.println(numberOfCloths+" "+costOfWashingPowder);
		

		return null;
	}
}

class Laundry {
	private int numberOfCloths; // cloth.length
	private float timeRequired;
	private float totalCost;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //

	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
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

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}

}

class Tub {

}

class WashingTub extends Tub {
	private int capacity;
	private String type; //

	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

class Powder {

}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;

	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}

	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*
	 * public String toString() { String str = (scented) ? "Scented" :"Not Scented";
	 * return str+ " "+brand+" Washing Powder of "+type+
	 * " type quantity used "+quantity+ " grams "; }
	 */

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

class Water {
	private String type;
	private int quantity;
	private String temperature;

	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
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

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public int getUnitUsed() {
		return unitUsed;
	}

	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}

}

class Cloth {
	private String color;
	private float cost;
	private boolean clean; //

	public Cloth(String color, float cost, boolean clean) {
		super();
		this.color = color;
		this.cost = cost;
		this.clean = clean;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

}
