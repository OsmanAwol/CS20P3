package Mastery;

import java.util.Random;

public class Bowling {

    private String name;   // Stores the bowler's name
    private int score;     // Tracks the bowler's total score
    private Random rand;   // Random generator for simulating pin drops

    /**
     * Constructor
     * pre: none
     * post: Bowler object created with name and score set to 0
     */
    public Bowling(String bowlerName) {
        name = bowlerName;   // Set the bowler's name
        score = 0;           // Start score at 0
        rand = new Random(); // Create random generator
    }

    /**
     * Simulates one frame of bowling
     * pre: none
     * post: updates score and returns number of points earned this frame
     */
    public int bowlFrame() {
        int pinsLeft = 10;   // Each frame starts with 10 pins

        // First throw (0–10 pins can be knocked down)
        int firstThrow = rand.nextInt(pinsLeft + 1);
        pinsLeft -= firstThrow;  // Reduce pins left after first throw

        if (firstThrow == 10) {
            // STRIKE: all pins knocked down on first throw
            score += 20;         // Award strike points
            return 20;
        }

        // Second throw (only remaining pins can be knocked down)
        int secondThrow = rand.nextInt(pinsLeft + 1);
        pinsLeft -= secondThrow;

        int pinsKnocked = firstThrow + secondThrow; // Total pins knocked in this frame

        if (pinsKnocked == 10) {
            // SPARE: all pins knocked down using two throws
            score += 15;         // Award spare points
            return 15;
        } else {
            // OPEN FRAME: fewer than 10 pins knocked down
            score += pinsKnocked; // Add actual pins knocked over
            return pinsKnocked;
        }
    }

    /**
     * Returns bowler name
     */
    public String getName() {
        return name;  // Return name field
    }

    /**
     * Returns current score
     */
    public int getScore() {
        return score; // Return total score so far
    }
}
