/*
 * Matthew Homan
 * Assignment 2: Inheritance and Encapsulation
 * April 11, 2023
 * CMIS 242 7382
 * Spring 2023
 * 
 * This program allows a user to order a salty or fruit snack and choose from additional options.
 * It then calculates the price and displays the order.
 * 
 */


public class Snack {

	private String id;
	private String size;
	private double price;
	
	final double S = 19.99;
	final double M = 29.99;
	final double L = 39.99;
	final double CITRUS = 5.99;
	final double NUT = 4.50;

	public Snack(String id, String size) {
		this.id = id;
		this.size = size;

		switch (size) {
		case "S": 
			setPrice(S);
			break;
		case "M":
			setPrice(M);
			break;
		case "L":
			setPrice(L);
			break;
		}
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString () {

		return "type = " + size + " ID = " + id + " and price = $" + String.format("%.2f", price) + "\n";

	}
	
}
