package finalProject;

public class GoodCard extends HonusCard {

	public GoodCard() {

		quality = 2;

		salesHistory = SalesHistoryDatabase.Good;
	}

	@Override
	public void estimateValue() {

		double e;

		if (this.salesDate < 2020) {
			// replace w/ exponential equation
			e = 53788.861314 * this.salesDate + -107575554.907543;
		} else {
			e = 53788.861314 * this.salesDate + -107575554.907543;
		}
		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}
}