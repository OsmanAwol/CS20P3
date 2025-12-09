/*
Program: LunchOrderTest.Java          Last Date of this Revision: December, 9, 2025
Purpose: Create a LunchOrder application that prompts the user for the number of hamburgers, salads, french
fries, and sodas and then displays the total for the orderS
Author: Osman Awol,
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

/**
 * Lunch Order Application
 * Allows the user to enter how many of each food item they want and
 * calculates total nutrition and total price.
 */
public class LunchOrderTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create Food objects using the values you gave
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food fries = new Food(1.30, 11, 36, 4);
        Food salad = new Food(2.00, 1, 11, 5);
        Food soda = new Food(0.95, 0, 38, 0);

        // USER INPUT + the new required nutritional message
        System.out.print("Enter number of hamburgers: ");
        int numHamburgers = input.nextInt();
        System.out.println("Each hamburger has " + hamburger.getFat() + " g of fat, "
                + hamburger.getCarbs() + " g of carbs, and "
                + hamburger.getFiber() + " g of fiber.\n");

        System.out.print("Enter number of fries: ");
        int numFries = input.nextInt();
        System.out.println("Each order of fries has " + fries.getFat() + " g of fat, "
                + fries.getCarbs() + " g of carbs, and "
                + fries.getFiber() + " g of fiber.\n");

        System.out.print("Enter number of salads: ");
        int numSalads = input.nextInt();
        System.out.println("Each salad has " + salad.getFat() + " g of fat, "
                + salad.getCarbs() + " g of carbs, and "
                + salad.getFiber() + " g of fiber.\n");

        System.out.print("Enter number of sodas: ");
        int numSodas = input.nextInt();
        System.out.println("Each soda has " + soda.getFat() + " g of fat, "
                + soda.getCarbs() + " g of carbs, and "
                + soda.getFiber() + " g of fiber.\n");

        // TOTAL CALCULATIONS
        double totalPrice = numHamburgers * hamburger.getPrice()
                + numFries * fries.getPrice()
                + numSalads * salad.getPrice()
                + numSodas * soda.getPrice();

        int totalFat = numHamburgers * hamburger.getFat()
                + numFries * fries.getFat()
                + numSalads * salad.getFat()
                + numSodas * soda.getFat();

        int totalCarbs = numHamburgers * hamburger.getCarbs()
                + numFries * fries.getCarbs()
                + numSalads * salad.getCarbs()
                + numSodas * soda.getCarbs();

        int totalFiber = numHamburgers * hamburger.getFiber()
                + numFries * fries.getFiber()
                + numSalads * salad.getFiber()
                + numSodas * soda.getFiber();

        // OUTPUT
        System.out.printf("Total price: $%.2f%n", totalPrice);
        System.out.println("Total fat: " + totalFat + " g");
        System.out.println("Total carbs: " + totalCarbs + " g");
        System.out.println("Total fiber: " + totalFiber + " g");

        input.close();
    }
}

/*
Enter number of hamburgers: 3
Each hamburger has 9 g of fat, 33 g of carbs, and 1 g of fiber.

Enter number of fries: 3
Each order of fries has 11 g of fat, 36 g of carbs, and 4 g of fiber.

Enter number of salads: 3
Each salad has 1 g of fat, 11 g of carbs, and 5 g of fiber.

Enter number of sodas: 3
Each soda has 0 g of fat, 38 g of carbs, and 0 g of fiber.

Total price: $18.30
Total fat: 63 g
Total carbs: 354 g
Total fiber: 30 g
*/