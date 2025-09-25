package SkillBuilders;

import java.util.Scanner; // Import Scanner class to get user input

public class RectPer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Ask the user for the rectangle's width
        System.out.print("Enter the width of the rectangle: ");
        int width = input.nextInt();

        // Ask the user for the rectangle's length
        System.out.print("Enter the length of the rectangle: ");
        int length = input.nextInt();

        // Calculate the perimeter using the formula: 2w + 2l
        int perimeter = (2 * width) + (2 * length);

        // Display the results
       
        System.out.println("The Width Is: " + width);
        System.out.println("The Length Is: " + length);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        input.close(); // Close the Scanner
    }
}
