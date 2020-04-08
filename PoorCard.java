package application;

//The comments in this class also apply to the other HonusCard Sub-classes

// PoorCard is a subclass of HonusCard
public class PoorCard extends HonusCard {

	public PoorCard() {

		// the constructor assigns the quality number that is associated with the card
		// quality
		quality = 1;

		// it also assigns the database array that corresponds with the card quality
		salesHistory = SalesHistoryDatabase.Poor;

	}

	@Override
	public void estimateValue() {

		// variable to store the numbers that the method is working with
		double e;

		// this if-else statement selects the most accurate equation for the card being
		// evaluated based on the year of valuation
		if (this.salesDate < 2011) {
			// quadratic equation for a more accurate estimate. This is due to the explosive
			// growth of cards in more recent years
			// Math.pow is a way to get exponential function in java since there is no way
			// to do exponential math within the syntax
			e = 7 * Math.pow(10, -165) * Math.exp(0.1944 * this.salesDate);
		} else {
			e = 39782.029850 * this.salesDate + -79606312.714205;
		}
		// assigns the double to the estimatedValue attribute of whatever HonusCard
		// object that it was run on.
		// estimatedValue is an int datatype so "e" is converted to an int after being
		// rounded to the nearest 1000.
		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}

}