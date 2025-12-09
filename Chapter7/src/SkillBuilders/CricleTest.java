package SkillBuilders;

public class CricleTest {
    public static void main(String[] args) {

        // Create a Circle object using the overloaded constructor (radius = 5)
        Circle c1 = new Circle(5);

        // Display the area formula (class method)
        Circle.displayAreaFormula();

        // Test basic Circle methods
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());

        // Test the toString method
        System.out.println("\nCircle info:");
        System.out.println(c1.toString());

        // Create more Circle objects to test equals()
        Circle c2 = new Circle(5);  // same radius as c1
        Circle c3 = new Circle(3);  // different radius

        System.out.println("\nTesting equals method:");
        
        // Should return true because radii match
        System.out.println("c1 equals c2? " + c1.equals(c2));

        // Should return false because radii differ
        System.out.println("c1 equals c3? " + c1.equals(c3));
    }
}
