/*
Program: GeneratedNums.java          Last Date of this Revision: December, 11, 2025
Purpose: Create a GeneratedNums application that generates the number
 to store in an array element by summing its index and the 
 individual digits of the index. 
Author: Osman Awol,
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

public class GeneratedNums {
    public static void main(String[] args) {

        // Create an array with 101 elements (0 to 100)
        int[] nums = new int[14];

        // Fill the array using the rule:
        // value = index + sum of the digits of the index
        for (int i = 0; i < nums.length; i++) {
            int tens = i / 10;     // tens digit
            int ones = i % 10;     // ones digit
            int sumDigits = tens + ones;

            nums[i] = i + sumDigits;
        }

        // Display column headers
        System.out.println("Index\tGenerated Number");
        System.out.println("-----\t----------------");

        // Display values in two columns
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "\t" + nums[i]);
        }
    }
}

/*
Index	Generated Number
-----	----------------
0	0
1	2
2	4
3	6
4	8
5	10
6	12
7	14
8	16
9	18
10	11
11	13
12	15
13	17
*/
