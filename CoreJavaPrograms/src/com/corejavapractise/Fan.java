package com.corejavapractise;

public class Fan extends Object {

	private int noOfWings;
	private String brand;
	private int cost;
	private String color;

//	public void setFanData(int a,String b, int c, String d) {
//		noOfWings=a;
//		brand=b;
//		cost=c;
//		color=d;
//	}

	// constructor
	public Fan(int noOfWings, String brand, int cost, String color) {
		this(3, "Usha", 1200);
		this.noOfWings = noOfWings;
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}

	// default constructor
	public Fan() {
		super();
	}

	public Fan(int noOfWings, String brand, int cost) {
		super();
		this.noOfWings = noOfWings;
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}

	public Fan(int noOfWings, String brand) {
		super();
		this.noOfWings = noOfWings;
		this.brand = brand;
		this.cost = cost;
		this.color = color;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public String getBrand() {
		return brand;
	}

	public int getCost() {
		return cost;
	}

	public String getColor() {
		return color;
	}

}
