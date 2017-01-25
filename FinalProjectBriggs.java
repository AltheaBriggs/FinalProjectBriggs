
/**
 *
 * Name:Althea Briggs,
 * Teacher:Mr.Hardman
 * Assignment final project, Program # 
 * Date Last Modified:Jan.20 2017 
 *
 */

import java.util.Scanner;

public class FinalProjectBriggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		// Scanner used to sort out certain array of ints in order from
		// smallest to biggest.

		int noOfGuesses = 0;
		int lettersCorrect = 0;
		String choiceToPlay;
		String userGuess;
		char menuChoice, letter;
		char[] guessWord = { 'h', 'e', 'l', 'l', 'o' };
		char[] correctLetter = { '-', '-', '-', '-', '-' };

		// int holds numerical variables.This int counts the # of guesses and
		// # of correct letters.
		// String method asks choice to play.
		// Character word is "Hello" which is what user is to guess.
		// Array is also being used to hold fixed # of items of single data
		// types.

		System.out.println("Hello and welcome to Hangman!");

		// main game menu
		// loop used for a sequence of instruction that is repeated until a
		// certain condition is reached.

		do {
			System.out.println("Do you want to play? Press Yes/No\n");

			choiceToPlay = keyboard.next();
			menuChoice = choiceToPlay.charAt(0);
			// variable asks user if they want to play Hangman game.

			if (!(menuChoice == 'y' || menuChoice == 'Y' || menuChoice == 'n' || menuChoice == 'N')) {
				System.out.println(String.format("You have entered an invalid option. Try again!\n"));
			} // if invalid (String format)
				// If user enters wrong letters program will say invalid option.
		} while (!(menuChoice == 'Y' || menuChoice == 'y' || menuChoice == 'n' || menuChoice == 'N'));

		if (menuChoice == 'N' || menuChoice == 'n') {
			System.out.println("You have chosen to leave the game.");
			System.out.println("Goodbye!");
			System.exit(0);
			//user chose to exit the game.
		}

		else
			// Else statements

			while (lettersCorrect < 5) {
				// Getting users guess.
				System.out.println("\nThe guess word has 5 letters.");
				System.out.println("Enter a letter to guess: ");

				userGuess = keyboard.next();
				letter = userGuess.charAt(0);

				// Incrementing letters each time.
				noOfGuesses++;

				if (letter == guessWord[0]) {
					System.out.println("There is 1 H in the word");
					System.out.println("You have guessed the first letter correctly.");
					correctLetter[0] = letter;
					System.out.println(correctLetter);
					System.out.println("You have had " + noOfGuesses + " guesses, so far");

					lettersCorrect++;

					System.out.println("Letters correct so far: " + lettersCorrect);
				} // if first letter is correct it will display the letter you
					// got right.
					// counts the amount of guesses you tried.
				else if (letter == guessWord[1]) {
					System.out.println("There is 1 E in the word");
					System.out.println("You have guessed the second letter correctly.");

					correctLetter[1] = letter;
					System.out.println(correctLetter);
					System.out.println("You have had " + noOfGuesses + " guesses, so far");

					lettersCorrect++;

					System.out.println("Letters correct so far: " + lettersCorrect);
				} // if second letter is correct display the same principle as
					// H.

				else if (letter == guessWord[2] || letter == guessWord[3]) {
					System.out.println("There are 2 L's in the word");
					System.out.println("You have guessed the third and fourth letters correctly.");

					correctLetter[2] = letter;
					correctLetter[3] = letter;
					System.out.println(correctLetter);
					System.out.println("You have had " + noOfGuesses + " guesses, so far");

					lettersCorrect += 2;

					System.out.println("Letters correct so far: " + lettersCorrect);

				} // if third and fourth letters

				else if (letter == guessWord[4]) {
					lettersCorrect++;
					System.out.println("There is 1 O in the word");
					System.out.println("You have guessed the fifth letter correctly.");
					correctLetter[4] = letter;
					System.out.println(correctLetter);
					System.out.println("You have had " + noOfGuesses + " guesses, so far");
					System.out.println("Letters correct so far: " + lettersCorrect);
				} // if fifth letter

				else {
					System.out.println("The letter you guessed is not in the word.\n");
					System.out.println("Guesses taken so far: " + noOfGuesses);
					System.out.println("Letters correct so far: " + lettersCorrect);
					// else loop if the user guesses a word that is not in the
					// word.
				} // Shows the guessed letters and correct letters so far.

				// Displays to the user you found the word is "Hello" and your
				// total number
				// number of guesses.

			}
		
		
		System.out.println("\nYou found the word!");
		System.out.println(String.format("It was hello."));
		System.out.println(String.format("Total guesses: " + noOfGuesses));
		System.exit(0);

		keyboard.close();

	}

}
