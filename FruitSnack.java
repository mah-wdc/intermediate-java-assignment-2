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


public class FruitSnack extends Snack{

	private boolean hasCitrus;

	public FruitSnack(String id, String size, boolean hasCitrus) {
		super(id, size);
		this.hasCitrus = hasCitrus;

		if(hasCitrus == true) {
			setPrice(getPrice() + CITRUS);
		}

	}
	
	public boolean isHasCitrus() {
		return hasCitrus;
	}

	public void setHasCitrus(boolean hasCitrus) {
		this.hasCitrus = hasCitrus;
	}

	public String toString() {
		return "You have chosen snack type = Fruit Snack, of  " + super.toString();
	}

}
