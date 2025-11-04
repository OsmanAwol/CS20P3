package SkillBuilders;

import java.util.Scanner;

public class PercentPassing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade;          // stores each grade entered
        double sum = 0;        // sum of passing grades (>= 70)
        int count = 0;         // counts number of passing grades
        int totalGrades = 0;   // counts all grades entered

        System.out.println("Enter grade percentages (enter a negative number to stop):");

        grade = input.nextDouble();

        while (grade >= 0) { // loop continues until a negative number is entered
            totalGrades++;

            if (grade >= 70) {
                sum += grade;
                count++;
            }

            System.out.print("Enter another grade (or a negative number to stop): ");
            grade = input.nextDouble();
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("\nNumber of passing grades: " + count);
            System.out.println("Average of passing grades: " + average);
        } else {
            System.out.println("\nNo passing grades entered.");
        }

        System.out.println("Total grades entered: " + totalGrades);

        input.close();
    }
}