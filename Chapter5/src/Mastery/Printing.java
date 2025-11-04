package Mastery;

import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of copies to print: ");
        int copies = input.nextInt();
        double pricePerCopy;

        // Determine the price per copy based on the number of copies
        if (copies >= 0 && copies <= 99) {
            pricePerCopy = 0.30;
        } else if (copies >= 100 && copies <= 499) {
            pricePerCopy = 0.28;
        } else if (copies >= 500 && copies <= 749) {
            pricePerCopy = 0.27;
        } else if (copies >= 750 && copies <= 1000) {
            pricePerCopy = 0.26;
        } else { // over 1000
            pricePerCopy = 0.25;
        }

        // Calculate total price
        double totalPrice = copies * pricePerCopy;

        // Display the results
        System.out.println("Price per copy: $" + pricePerCopy);
        System.out.println("Total price for " + copies + " copies: $" + totalPrice);

        input.close();
    }
}