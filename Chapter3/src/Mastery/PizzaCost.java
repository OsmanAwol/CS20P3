package Mastery;

import java.util.Scanner;

	public class PizzaCost {
	    public static void main(String[] args) {
	        // Create Scanner for user input
	        Scanner input = new Scanner(System.in);

	        // Constants
	        final double LABOR_COST = 0.75;
	        final double RENT_COST = 1.00;
	        final double MATERIALS_RATE = 0.05;

	        // Prompt the user for the diameter of the pizza
	        System.out.print("Enter the diameter of the pizza (in inches): ");
	        double diameter = input.nextDouble();

	        // Calculate material cost
	        double materialsCost = MATERIALS_RATE * diameter * diameter;

	        // Calculate total cost
	        double totalCost = LABOR_COST + RENT_COST + materialsCost;

	        // Display the result
	        System.out.printf("The cost of making a pizza with a diameter of %.2f inches is: $%.2f%n",
	                diameter, totalCost);

	        // Close the scanner
	        input.close();
	    }
	
	}


