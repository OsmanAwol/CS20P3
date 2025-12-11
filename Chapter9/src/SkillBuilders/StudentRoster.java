package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Ask for number of students
			System.out.print("Enter number of students: ");
			int count = input.nextInt();
			input.nextLine(); // clear input buffer

			// Create array to store names
			String[] students = new String[count];

			// Input names
			for (int i = 0; i < count; i++) {
			    System.out.print("Enter name of student #" + (i + 1) + ": ");
			    students[i] = input.nextLine();
			}

			// Display roster
			System.out.println("\nStudent Roster");
			System.out.println("--------------");

			for (int i = 0; i < count; i++) {
			    System.out.println(students[i]);
			}
		}
    }
}
