package SkillBuilders;

	import java.util.Scanner;

	public class Delivery {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Ask user for dimensions
	        System.out.print("Enter the length of the package: ");
	        double length = input.nextDouble();

	        System.out.print("Enter the width of the package: ");
	        double width = input.nextDouble();

	        System.out.print("Enter the height of the package: ");
	        double height = input.nextDouble();

	        // Check if any dimension is greater than 10
	        if (length > 10 || width > 10 || height > 10) {
	            System.out.println("Package Rejected");
	        } else {
	            System.out.println("Package Accepted");
	        }

	        input.close();
	    }
	


	}


