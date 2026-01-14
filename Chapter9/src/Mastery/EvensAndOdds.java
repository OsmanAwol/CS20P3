
/*
Program: EvensAndOdds.java          Last Date of this Revision: January, 14, 2026
Purpose: This program generates 25 random integers between 0 and 99,
stores them in an array, and then displays all odd numbers
on one line and all even numbers on the next line.
Author: Osman Awol,
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Random;

public class EvensAndOdds {
    public static void main(String[] args) {
    	//create a random object
        Random rand = new Random();
        //create an array
        int[] numbers = new int[25];

        // generate 25 random numbers between 0 and 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        // display odd numbers
        System.out.print("ODD: ");
        for (int i = 0; i < numbers.length; i++) {
        	//checks if a number is odd or not
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // new line before evens
        System.out.println();

        // display even numbers
        System.out.print("EVEN: ");
        for (int i = 0; i < numbers.length; i++) {
        	//checks if number is even or not
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

/*
ODD: 57 27 97 57 87 97 43 37 21 17 1 13 31 33 
EVEN: 90 72 0 36 22 32 56 48 12 96 28 
*/