package Mastery;

	import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
		       Scanner input = new Scanner(System.in);

		        // Ask the user for the time
		        System.out.print("Enter the time in seconds thats less than 4.5: ");
		        double t = input.nextDouble();

		        // Check if the input is valid
		        if (t >= 4.5) {
		            System.out.println("Error: Time must be less than 4.5 seconds.");
		        } else {
		            // Calculate height using the formula h = 100 - 4.9 * t^2
		            double height = 100 - 4.9 * t * t;

		            // Display the result
		            System.out.printf("At %.2f seconds, the object is at a height of %.2f meters.\n", t, height);
		        }

		        input.close();
		    }
		


	}

