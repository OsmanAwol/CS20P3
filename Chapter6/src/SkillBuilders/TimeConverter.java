package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

    // Method to convert hours to minutes
    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }

    // Method to convert days to hours
    public static int daysToHours(int days) {
        return days * 24;
    }

    // Method to convert minutes to hours
    public static double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Method to convert hours to days
    public static double hoursToDays(int hours) {
        return hours / 24.0;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Time Converter Application");
        System.out.println("1. Convert hours to minutes");
        System.out.println("2. Convert days to hours");
        System.out.println("3. Convert minutes to hours");
        System.out.println("4. Convert hours to days");
        System.out.print("Enter your choice (1-4): ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter hours: ");
                int hours = input.nextInt();
                System.out.println(hours + " hours = " + hoursToMinutes(hours) + " minutes");
                break;

            case 2:
                System.out.print("Enter days: ");
                int days = input.nextInt();
                System.out.println(days + " days = " + daysToHours(days) + " hours");
                break;

            case 3:
                System.out.print("Enter minutes: ");
                int minutes = input.nextInt();
                System.out.println(minutes + " minutes = " + minutesToHours(minutes) + " hours");
                break;

            case 4:
                System.out.print("Enter hours: ");
                int hrs = input.nextInt();
                System.out.println(hrs + " hours = " + hoursToDays(hrs) + " days");
                break;

            default:
                System.out.println("Invalid choice!");
        }
        input.close();
      
    }
}
