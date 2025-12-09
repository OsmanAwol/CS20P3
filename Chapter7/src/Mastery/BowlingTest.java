/*
Program: Bowling.java          Last Date of this Revision: December, 9, 2025
Purpose: In bowling, a ball is rolled down a lane, also called an alley, at a set of ten pins. A game consists of a
bowler bowling for ten frames, where each frame consists of two chances (throws) to knock over all ten
pins. 
Author: Osman Awol,
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class BowlingTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user how many bowlers will play
        System.out.print("How many bowlers are playing? ");
        int numBowlers = input.nextInt();
        input.nextLine(); // consume extra newline left by nextInt()

        // Create an array to hold the Bowler objects
        Bowling[] bowlers = new Bowling[numBowlers];

        // Create Bowler objects by asking user for names
        for (int i = 0; i < numBowlers; i++) {
            System.out.print("Enter bowler #" + (i + 1) + " name: ");
            String name = input.nextLine();
            bowlers[i] = new Bowling(name);
        }

        // Play all 10 frames of the game
        for (int frame = 1; frame <= 10; frame++) {
            System.out.println("\n=== Frame " + frame + " ===\n");

            // Each bowler takes one frame
            for (int i = 0; i < numBowlers; i++) {
                Bowling b = bowlers[i];

                System.out.println(b.getName() + " is bowling...");

                // Simulate one frame and get points earned
                int points = b.bowlFrame();

                System.out.println("Points earned this frame: " + points);
                System.out.println("Total score so far: " + b.getScore());
                System.out.println();
            }
        }

        // Print final scores after all 10 frames
        System.out.println("\n===== FINAL SCORES =====");
        for (int i = 0; i < numBowlers; i++) {
            System.out.println(bowlers[i].getName() + ": " + bowlers[i].getScore());
        }

        input.close(); // Close Scanner to prevent memory leak
    }
}

/*
How many bowlers are playing? 5
Enter bowler #1 name: Osman
Enter bowler #2 name: Moammed
Enter bowler #3 name: Ahmed
Enter bowler #4 name: Jack
Enter bowler #5 name: Max

=== Frame 1 ===

Osman is bowling...
Points earned this frame: 8
Total score so far: 8

Moammed is bowling...
Points earned this frame: 3
Total score so far: 3

Ahmed is bowling...
Points earned this frame: 8
Total score so far: 8

Jack is bowling...
Points earned this frame: 8
Total score so far: 8

Max is bowling...
Points earned this frame: 20
Total score so far: 20


=== Frame 2 ===

Osman is bowling...
Points earned this frame: 9
Total score so far: 17

Moammed is bowling...
Points earned this frame: 15
Total score so far: 18

Ahmed is bowling...
Points earned this frame: 9
Total score so far: 17

Jack is bowling...
Points earned this frame: 5
Total score so far: 13

Max is bowling...
Points earned this frame: 20
Total score so far: 40


=== Frame 3 ===

Osman is bowling...
Points earned this frame: 8
Total score so far: 25

Moammed is bowling...
Points earned this frame: 8
Total score so far: 26

Ahmed is bowling...
Points earned this frame: 15
Total score so far: 32

Jack is bowling...
Points earned this frame: 9
Total score so far: 22

Max is bowling...
Points earned this frame: 8
Total score so far: 48


=== Frame 4 ===

Osman is bowling...
Points earned this frame: 7
Total score so far: 32

Moammed is bowling...
Points earned this frame: 5
Total score so far: 31

Ahmed is bowling...
Points earned this frame: 5
Total score so far: 37

Jack is bowling...
Points earned this frame: 7
Total score so far: 29

Max is bowling...
Points earned this frame: 9
Total score so far: 57


=== Frame 5 ===

Osman is bowling...
Points earned this frame: 9
Total score so far: 41

Moammed is bowling...
Points earned this frame: 1
Total score so far: 32

Ahmed is bowling...
Points earned this frame: 4
Total score so far: 41

Jack is bowling...
Points earned this frame: 5
Total score so far: 34

Max is bowling...
Points earned this frame: 15
Total score so far: 72


=== Frame 6 ===

Osman is bowling...
Points earned this frame: 2
Total score so far: 43

Moammed is bowling...
Points earned this frame: 9
Total score so far: 41

Ahmed is bowling...
Points earned this frame: 2
Total score so far: 43

Jack is bowling...
Points earned this frame: 9
Total score so far: 43

Max is bowling...
Points earned this frame: 3
Total score so far: 75


=== Frame 7 ===

Osman is bowling...
Points earned this frame: 9
Total score so far: 52

Moammed is bowling...
Points earned this frame: 2
Total score so far: 43

Ahmed is bowling...
Points earned this frame: 6
Total score so far: 49

Jack is bowling...
Points earned this frame: 9
Total score so far: 52

Max is bowling...
Points earned this frame: 6
Total score so far: 81


=== Frame 8 ===

Osman is bowling...
Points earned this frame: 9
Total score so far: 61

Moammed is bowling...
Points earned this frame: 7
Total score so far: 50

Ahmed is bowling...
Points earned this frame: 20
Total score so far: 69

Jack is bowling...
Points earned this frame: 6
Total score so far: 58

Max is bowling...
Points earned this frame: 8
Total score so far: 89


=== Frame 9 ===

Osman is bowling...
Points earned this frame: 15
Total score so far: 76

Moammed is bowling...
Points earned this frame: 8
Total score so far: 58

Ahmed is bowling...
Points earned this frame: 6
Total score so far: 75

Jack is bowling...
Points earned this frame: 7
Total score so far: 65

Max is bowling...
Points earned this frame: 1
Total score so far: 90


=== Frame 10 ===

Osman is bowling...
Points earned this frame: 6
Total score so far: 82

Moammed is bowling...
Points earned this frame: 15
Total score so far: 73

Ahmed is bowling...
Points earned this frame: 4
Total score so far: 79

Jack is bowling...
Points earned this frame: 20
Total score so far: 85

Max is bowling...
Points earned this frame: 9
Total score so far: 99


===== FINAL SCORES =====
Osman: 82
Moammed: 73
Ahmed: 79
Jack: 85
Max: 99
*/