

package SkillBuilders;

import java.util.Scanner;
import java.util.Random;

public class RandumNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Ask user for min and max values
        System.out.print("Enter the minimum value: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = input.nextInt();

        if (min > max) {
            System.out.println("Error: Minimum must be less than or equal to maximum.");
        } else {
            // Generate random integer between min and max (inclusive)
            int randomNum = rand.nextInt((max - min) + 1) + min;

            // Display result
            System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
        }

        input.close();
    }
}

