package SkillBuilders;

/**
 * Circle class that represents a circle and allows
 * calculations for area and circumference.
 */
public class Circle {

    // Constant for pi used in calculations
    private static final double PI = 3.14;

    // Member variable that stores the radius of the circle
    private double radius;

    /**
     * Default constructor
     * pre: none
     * post: A Circle object is created with a default radius of 1.
     */
    public Circle() {
        radius = 1; // default radius
    }

    /**
     * Overloaded constructor
     * pre: none
     * post: A Circle object is created with the given radius.
     */
    public Circle(double newRadius) {
        radius = newRadius;
    }

    /**
     * Changes the radius of the circle.
     * pre: none
     * post: The radius has been updated.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /**
     * Calculates the area of the circle.
     * Formula: A = πr²
     * pre: none
     * post: The area of the circle is returned.
     */
    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return(circleArea);
    }

    /**
     * Calculates the circumference of the circle.
     * Formula: C = 2πr
     * pre: none
     * post: The circumference of the circle is returned.
     */
    public double circumference() {
        double circleCircumference;
        circleCircumference = 2 * PI * radius;
        return(circleCircumference);
    }

    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius value is returned.
     */
    public double getRadius() {
        return(radius);
    }

    /**
     * Displays the formula for calculating area.
     * pre: none
     * post: The area formula is printed to the screen.
     */
    public static void displayAreaFormula() {
        System.out.println("Area Formula: A = πr²");
    }

    /**
     * Checks if this circle is equal to another object.
     * Two circles are equal if their radii are the same.
     * pre: none
     * post: true returned if radii match, otherwise false.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle)obj;
            return (this.radius == otherCircle.radius);
        }
        return false;
    }

    /**
     * Returns a string describing the circle.
     * pre: none
     * post: A String containing radius, area, and circumference is returned.
     */
    public String toString() {
        return("Circle radius: " + radius +
               ", area: " + area() +
               ", circumference: " + circumference());
    }
}
