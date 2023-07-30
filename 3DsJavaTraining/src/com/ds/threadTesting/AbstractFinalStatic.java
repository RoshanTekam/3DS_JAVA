package com.ds.threadTesting;

public class AbstractFinalStatic {
	public static void main(String[] args) {
		Shape shape=new Squre();
		shape.calcArea();

	}

}

abstract class Shape {
	public abstract void calcArea();

	protected abstract void calcPerimeter();

	public void fillColor() {
		System.out.println("Green would be perfect ...");
	}

}
class Squre extends Shape{
	
	public void calcArea()
	{
		System.out.println(" area 1");
	}
	public void calcPerimeter()
	{
		System.out.println("perimeter 1..");
	}
}
class Traingle extends Shape{
	public void calcArea() {
		System.out.println("area 2");
	}
	public void calcPerimeter()
	{
		System.out.println("perimeter 2");
	}
}