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

import java.util.Scanner;

public class OrderSystem {

	static Scanner userInput = new Scanner(System.in);
	static Scanner sizeInput = new Scanner(System.in);

	public static void displayMenu() {

		System.out.print("\nMENU");
		System.out.print("\n1: Order Snack");
		System.out.print("\n2: Exit Program");
		System.out.print("\nEnter your selection: ");

	}

	public static void displaySubmenu() {

		System.out.print("\nDo you want Fruit Snack (1) or Salty Snack (2): ");

	}

	public static void displaySizeMenu() {

		System.out.print("\nWhat size do you want: S, M, or L: ");
	}


	public static void processMenuSelection(int userSelection) {

		if (userSelection == 1) {
			displaySubmenu();			
		} else if(userSelection == 2) {
			System.out.println("\nThank you for using the program. Goodbye!");	
		} else {
			System.out.println("Invalid choice. Goodbye.");
		}

	}

	public static void citrusSelection() {

		System.out.print("\nDo you want citrus fruit included? true/false: ");
	}

	public static void nutSelection() {

		System.out.print("\nDo you want nut snack included? true/false: ");
	}

	public static void go() {

		//OrderSystem order = new OrderSystem();
		int menuSelection = 0, submenuSelection = 0;
		String sizeSelection;
		boolean citrus, nut;



		displayMenu();
		menuSelection = userInput.nextInt();

		processMenuSelection(menuSelection);

		submenuSelection = userInput.nextInt();

		displaySizeMenu();
		sizeSelection = sizeInput.nextLine();

		if (menuSelection == 1) {

			if (submenuSelection == 1) {
				FruitSnack fruit;
				//code for Fruit

				switch (sizeSelection) {
				case "S":

					citrusSelection();
					citrus = userInput.nextBoolean();

					fruit = new FruitSnack("SF1", "S", citrus);

					System.out.print(fruit);

					break;

				case "M":

					citrusSelection();
					citrus = userInput.nextBoolean();

					fruit = new FruitSnack("MF1", "M", citrus);

					System.out.print(fruit);

					break;

				case "L":

					citrusSelection();
					citrus = userInput.nextBoolean();

					fruit = new FruitSnack("LF1", "L", citrus);

					System.out.print(fruit);

					break;
				}
			} else {
				SaltySnack salty;
				//code for Nut
				switch (sizeSelection) {
				case "S":

					nutSelection();
					nut = userInput.nextBoolean();

					salty = new SaltySnack("SS1", "S", nut);

					System.out.print(salty);

					break;

				case "M":

					nutSelection();
					nut = userInput.nextBoolean();

					salty = new SaltySnack("MS1", "M", nut);

					System.out.print(salty);

					break;

				case "L":

					nutSelection();
					nut = userInput.nextBoolean();

					salty = new SaltySnack("LS1", "L", nut);

					System.out.print(salty);

					break;
				}
			} 
		}


	}



	public static void main(String[] args) {

		go();

	}

}
