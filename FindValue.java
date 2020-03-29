
package finalProject;

public class FindValue {

	// Method returns estimate for a sale price, or a historical sales price if one
	// exists
	public static void returnStuff(HonusCard wagner) {

		int sale = linearSearch(wagner); // See if a card of this quality was sold during this year

		if (sale == -1) {// If not, estimate the value of the card during the year and tell it to the
							// user

			wagner.estimateValue();


			if (wagner.estimatedValue < 1000) { // If the estimate is negative or unrealistically low
				System.out.println("I'm having a hard time estimating the value of this card at this time");
			}
			if (wagner.salesDate < 2020) {
				System.out.println("I estimate this card to have had a value of approximately $" + wagner.estimatedValue
						+ " in " + wagner.salesDate);
			} else {
				System.out.println("I estimate this card to have a value of approximately $" + wagner.estimatedValue
						+ " in " + wagner.salesDate);
			}

		} else {// If so, tell the user how much the card actually sold for
			System.out.println(
					"A card of this quality sold for $" + wagner.salesHistory[1][sale] + " in " + wagner.salesDate);
		}

	}

	// Linear search, which sees if the card sold for a certain value in that year
	public static int linearSearch(HonusCard wagner) {
		// Check every item in the first row of the referenced array to see if there is a match for the year
		for (int i = 0; i < wagner.salesHistory[0].length; i++) {
			if (wagner.salesDate == wagner.salesHistory[0][i])
				return i; // Return index of the year in question
		}

		return -1; // If the specified year is note found within the proper array, return a
					// "default" value
	}

}