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


public class SaltySnack extends Snack {

	private boolean hasNuts;

	public SaltySnack(String id, String size, boolean hasNuts) {
		super(id, size);
		this.hasNuts = hasNuts;

		if(hasNuts == true) {
			setPrice(getPrice() + NUT);
		}	
	}

	public boolean isHasNuts() {
		return hasNuts;
	}

	public void setHasNuts(boolean hasNuts) {
		this.hasNuts = hasNuts;
	}

	public String toString() {
		return "You have chosen snack type = Salty Snack, of  " + super.toString();	}



}
