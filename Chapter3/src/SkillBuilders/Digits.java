package SkillBuilders; // Package declaration at the top

import java.util.Scanner; // Import Scanner class to take input

public class Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a two-digit number
        System.out.print("Enter a two-digit number: ");
        int number = input.nextInt();

        // Separate the tens and ones digits
        int ones = number % 10;   // remainder gives the ones digit
        int tens = number / 10;   // integer division gives the tens digit

        // Display the result
        System.out.println("Tens digit: " + tens);
        System.out.println("Ones digit: " + ones);

        input.close();
    }
}
