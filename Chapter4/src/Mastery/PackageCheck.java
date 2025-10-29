package Mastery;

import java.util.Scanner;

public class PackageCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for weight and dimensions
        System.out.print("Enter the weight of the package in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter the length of the package in centimeters: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the package in centimeters: ");
        double width = input.nextDouble();

        System.out.print("Enter the height of the package in centimeters: ");
        double height = input.nextDouble();

        // Calculate volume in cubic centimeters
        double volume = length * width * height;

        // Check conditions
        boolean tooHeavy = weight > 27;
        boolean tooLarge = volume > 100000;

        // Display results
        if (tooHeavy && tooLarge) {
            System.out.println("Too heavy and too large.");
        } else if (tooHeavy) {
            System.out.println("Too heavy.");
        } else if (tooLarge) {
            System.out.println("Too large.");
        } else {
            System.out.println("Package is acceptable.");
        }

        input.close();
    }



	}

