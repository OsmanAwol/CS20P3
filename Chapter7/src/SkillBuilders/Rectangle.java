package SkillBuilders;

/**
 * Rectangle class.
 */
public class Rectangle {

    private double length;  // Stores the rectangle's length
    private double width;   // Stores the rectangle's width

    /**
     * Constructor
     * pre: none
     * post: A Rectangle object created with length and width set to 1.
     */
    public Rectangle() {
        length = 1;   // Default length
        width = 1;    // Default width
    }

    /**
     * Overloaded constructor
     * pre: none
     * post: A Rectangle object created using given length and width.
     */
    public Rectangle(double newLength, double newWidth) {
        length = newLength;   // Assign provided length
        width = newWidth;     // Assign provided width
    }

    /**
     * Sets the length of the rectangle.
     * pre: none
     * post: Length has been changed.
     */
    public void setLength(double newLength) {
        length = newLength;   // Update length
    }

    /**
     * Sets the width of the rectangle.
     * pre: none
     * post: Width has been changed.
     */
    public void setWidth(double newWidth) {
        width = newWidth;     // Update width
    }

    /**
     * Returns the length.
     * pre: none
     * post: Length returned.
     */
    public double getLength() {
        return length;        // Return current length
    }

    /**
     * Returns the width.
     * pre: none
     * post: Width returned.
     */
    public double getWidth() {
        return width;         // Return current width
    }

    /**
     * Calculates the area.
     * pre: none
     * post: Area returned.
     */
    public double area() {
        return length * width;  // Area formula
    }

    /**
     * Calculates the perimeter.
     * pre: none
     * post: Perimeter returned.
     */
    public double perimeter() {
        return 2 * (length + width); // Perimeter formula
    }

    /**
     * Displays the area formula.
     * pre: none
     * post: The area formula printed.
     */
    public static void displayAreaFormula() {
        System.out.println("Area Formula: A = length × width");  // Print formula
    }

    /**
     * Determines if two rectangles are equal.
     * pre: none
     * post: true returned if lengths and widths are equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {     // Ensure object is a Rectangle
            Rectangle other = (Rectangle)obj;
            return (this.length == other.length && this.width == other.width); 
            // Check if both dimensions match
        }
        return false;  // Not a Rectangle, so not equal
    }

    /**
     * Returns a String describing the rectangle.
     * pre: none
     * post: A String returned.
     */
    public String toString() {
        return "Rectangle length: " + length +
               ", width: " + width +
               ", area: " + area() +
               ", perimeter: " + perimeter();  // Build descriptive string
    }
}
