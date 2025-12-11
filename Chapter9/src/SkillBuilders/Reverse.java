package SkillBuilders;

public class Reverse {
    public static void main(String[] args) {

        // Create an integer array with 10 elements
        int[] numbers = new int[10];

        // Store the index number in each element
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;  // element stores its index
        }

        // Display the title
        System.out.println("Countdown");
        System.out.println("---------");

        // Display values in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
