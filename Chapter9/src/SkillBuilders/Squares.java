package SkillBuilders;

public class Squares {
    public static void main(String[] args) {

        // Create an integer array of 5 elements
        int[] squares = new int[5];

        // Store the square of each index
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;  // square of the index
        }

        // Display each value in the array
        System.out.println("Squares of Index Values:");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Index " + i + ": " + squares[i]);
        }
    }
}
