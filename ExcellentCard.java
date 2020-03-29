package finalProject;

public class ExcellentCard extends HonusCard {

	public ExcellentCard() {

		quality = 4;

		salesHistory = SalesHistoryDatabase.Exellent;
	}

	@Override
	public void estimateValue() {

		double e;

		// quadratic equation for a more accurate estimate. This is due to the explosive
		// growth of high-quality cards in more recent years
		// Math.pow is a way to get exponential function in java since there is no way
		// to do exponential math within the syntax
		if (salesDate < 2020) {
			e = 4541309277.0 - 5000000 * this.salesDate + 1200 * Math.pow(this.salesDate, 2);
		} else {
			e = 93216 * this.salesDate + -200000000;
		}

		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}

}
