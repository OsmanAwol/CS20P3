package SkillBuilders;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
		
        	
        	// Prompt the user for a phrase (can contain spaces)
			System.out.print("Enter a phrase: ");
			String phrase = input.nextLine();

			int letterCount = 0;

			// Count only alphabetic characters
			for (int i = 0; i < phrase.length(); i++) {
			    char ch = phrase.charAt(i);

			    // Check if the character is a letter (A–Z or a–z)
			    if (Character.isLetter(ch)) {
			        letterCount++;
			    }
			}

			// Display the result
			System.out.println("Number of letters in the phrase: " + letterCount);
		}
    }
}
