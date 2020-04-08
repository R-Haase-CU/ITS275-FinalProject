package application;

import java.text.NumberFormat;

public class FindValue {

	public static String returnStuff(HonusCard wagner) {

		// runs the linearSearch method on the HonusCard object that was imported
		// sets the result of the linear search method to the variable "sale"
		int sale = linearSearch(wagner);

		// this if-else statement will run the estimateValue method IF the search finds
		// no known transactions.
		// if a known transaction is found, it will return the information contained in
		// the database array.
		if (sale == -1) {

			wagner.estimateValue();

			// this statement will return an error if the estimate is too low.
			// otherwise, it returns the value as a string in the correct tense.
			if (wagner.estimatedValue < 1000) {
				return ("I'm having a hard time estimating the value of this card at this time");
			} else if (wagner.salesDate < 2020 && wagner.estimatedValue > 1000) {
				return ("I estimate this card to have had a value of approximately $"
						+ NumberFormat.getInstance().format(wagner.estimatedValue) + " in " + wagner.salesDate);
			} else {
				return ("I estimate this card to have a value of approximately $"
						+ NumberFormat.getInstance().format(wagner.estimatedValue) + " in " + wagner.salesDate);
			}

		} else {
			return ("A card of this quality sold for $"
					+ NumberFormat.getInstance().format(wagner.salesHistory[1][sale]) + " in " + wagner.salesDate);
		}

	}

	// the linearSearch method will run a search through the salesHistory array
	// stored in the card object.
	// if the search finds a match, it will return the value of the index
	// if there is no match, the method will return a -1
	public static int linearSearch(HonusCard wagner) {
		for (int i = 0; i < wagner.salesHistory[0].length; i++) {
			if (wagner.salesDate == wagner.salesHistory[0][i])
				return i;
		}

		return -1;
	}

}