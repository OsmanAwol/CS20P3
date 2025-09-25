package SkillBuilders; // Package declaration at the top


import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;     // total of all grades
        double average;  // the average of grades

        // Ask the user to enter five grades
        System.out.println("Please enter five grades:");

        System.out.print("Enter the first grade: ");
        sum += input.nextInt();  // using += to add to sum

        System.out.print("Enter the second grade: ");
        sum += input.nextInt();

        System.out.print("Enter the third grade: ");
        sum += input.nextInt();

        System.out.print("Enter the fourth grade: ");
        sum += input.nextInt();

        System.out.print("Enter the fifth grade: ");
        sum += input.nextInt();

        // Calculate the average
        average = sum / 5.0;  // real division

        // Display the result as a percentage
        System.out.printf("Your grade average is: %.2f%%\n", average);

        input.close();
    }
}
