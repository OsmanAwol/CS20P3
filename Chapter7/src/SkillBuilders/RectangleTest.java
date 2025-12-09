package SkillBuilders;

public class RectangleTest {
    public static void main(String[] args) 
    {

        // Create a Rectangle object using the overloaded constructor (length = 5, width = 3)
        Rectangle r1 = new Rectangle(5, 3);

        // Display the area formula (class method)
        Rectangle.displayAreaFormula();

        // Test the Rectangle methods
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        // Test the toString method
        System.out.println("\nRectangle info:");
        System.out.println(r1.toString());

        // Create additional rectangles to test the equals() method
        Rectangle r2 = new Rectangle(5, 3); // same dimensions as r1
        Rectangle r3 = new Rectangle(4, 4); // different dimensions

        System.out.println("\nTesting equals method:");

        // Should return true because r1 and r2 have the same length + width
        System.out.println("r1 equals r2? " + r1.equals(r2));

        // Should return false because r1 and r3 have different dimensions
        System.out.println("r1 equals r3? " + r1.equals(r3));
    }
}
