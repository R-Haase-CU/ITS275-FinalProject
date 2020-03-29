package finalProject;

public class PoorCard extends HonusCard {
	// PoorCard is a subclass of HonusCard

	// Constructor that assigns quality to 1, as all poor cards have a quality value
	// of 1
	public PoorCard() {

		quality = 1;

		salesHistory = SalesHistoryDatabase.Poor;

	}

	@Override
	public void estimateValue() {

		double e;

		if (this.salesDate < 2011) {
			// replace w/ exponential equation
			e = 39782.029850 * this.salesDate + -79606312.714205;
		} else {
			e = 39782.029850 * this.salesDate + -79606312.714205;
		}
		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}

}
