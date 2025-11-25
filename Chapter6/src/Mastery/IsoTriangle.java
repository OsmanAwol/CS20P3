/*

Program: IsoTriangle.java          Last Date of this Revision: November 17, 2025

Purpose:Create an IsoTriangle application that prompts the user for the size of an isosceles triangle and then
displays the triangle with that many lines.

Author: Osman Awol, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;

import java.util.Scanner;

public class IsoTriangle {

    // Method from the chapter: prints a bar of stars
    public static void drawBar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }

    // Method to print spaces
    public static void addSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the isosceles triangle: ");
        int size = input.nextInt();

        // Loop from 1 to size to draw each line
        for (int line = 1; line <= size; line++) {

            // Print spaces on the left side
            addSpaces(size - line);

            // Print stars (drawBar)
            drawBar(line * 2 - 1);

            // Move to next line
            System.out.println();
        }

        input.close();
    }
}


/* Screen Dump
 
Enter the size of the isosceles triangle: 12
           *
          ***
         *****
        *******
       *********
      ***********
     *************
    ***************
   *****************
  *******************
 *********************
***********************
 
 */
