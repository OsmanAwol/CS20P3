package SkillBuilders;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // Display numbers from 1 up to the entered number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum = sum + i; // Add each number to the sum
        }

        // Display the total sum at the bottom
        System.out.println("Sum = " + sum);

        input.close();
    }
}