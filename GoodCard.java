package application;

public class GoodCard extends HonusCard {

	public GoodCard() {

		quality = 2;

		salesHistory = SalesHistoryDatabase.Good;
	}

	@Override
	public void estimateValue() {

		double e;

		if (this.salesDate < 2020) {
			e = 4 * Math.pow(10, -110) * Math.exp(0.1318 * this.salesDate);
		} else {
			e = 53788.861314 * this.salesDate + -107575554.907543;
		}
		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}
}