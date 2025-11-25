package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

    // Method that returns base raised to the exponent
    public static double powerOf(double base, int exponent) {
        double result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        double answer = powerOf(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " = " + answer);

        input.close();
    }
}
