package Mastery;

/**
 * Food class stores nutritional information for a single food item.
 */
public class Food {

    private double price;
    private int fat;
    private int carbs;
    private int fiber;

    /**
     * Constructor
     * pre: none
     * post: A Food object is created with price, fat, carbs, and fiber.
     */
    public Food(double p, int f, int c, int fi) {
        price = p;
        fat = f;
        carbs = c;
        fiber = fi;
    }

    public double getPrice() {
        return price;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFiber() {
        return fiber;
    }
}
