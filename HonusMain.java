
package finalProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HonusMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Establishes a scanner to get info on user's card

		// Greet the user and request the quality of their card
		System.out.println("Welcome to the Honus Wagner Card Value Calculator!\n"
				+ "I am Honus Wagner Card Man, a highly sophistic algorithm designed to help you estimate the value "
				+ "of your T206 Honus Wagner cards!\n");
		System.out.print("Please enter the quality of your T206 Honus Wagner card\n"
				+ "(1- Poor to Fair, 2- Good, 3- Very Good, 4+- Anything Better): ");

		int quality;
		quality = input.nextInt(); // Store quality
		while (quality < 1) // Ask until given an acceptable input
		{
			System.out.print("Please enter a positive integer: ");
			quality = input.nextInt(); // Store quality
		}
		System.out.println(); // Line break

		HonusCard user = null;
		switch (quality) {
		case 1:
			user = new PoorCard();
			break;
		case 2:
			user = new GoodCard();
			break;
		case 3:
			user = new VeryGoodCard();
			break;
		case 4:
			user = new ExcellentCard();
			break;
		}

		// input mismatch exception handling for the salesDate user input
		// also included is a date check to ensure that the date that the user is
		// checking is a date that is compatible with the calculations
		boolean collectDate = true;

		do {
			try {
				// Ask for the year they're selling the card
				System.out.print("Please enter the year in which you would like to sell your T206 Honus Wagner card: ");
				user.salesDate = input.nextInt(); // Store year of sale

				// Check date
				if (user.salesDate < 1909) { // Pre-print
					System.out.println("The T206 Honus Wagner card did not exist before 1909");
				} else if (user.salesDate >= 1909 && user.salesDate <= 1911) { // Pre-discontinuation
					System.out.println("The card was sold with cigerette boxes until Wagner said \"NO MORE\" in 1911, "
							+ "only 50-200 were ever printed");
				} else if (user.salesDate > 1911 && user.salesDate < 1985) { // Pre-fame
					System.out.println(
							"Nobody really cared about the card until 1985, when it sold for a good chunk of money");
				} else {
					collectDate = false;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Make sure you enter a valid year");
				input.nextLine();
			}

		} while (collectDate);

		// Put out a price based on what the user put in
		System.out.println(); // Line break
		FindValue.returnStuff(user); // Send the card to the class that does all the work
		// It even does the printing

		input.close(); // Close memory leak

	}

}