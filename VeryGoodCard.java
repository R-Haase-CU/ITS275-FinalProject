package application;

public class VeryGoodCard extends HonusCard {

	public VeryGoodCard() {

		quality = 3;

		salesHistory = SalesHistoryDatabase.VeryGood;
	}

	@Override
	public void estimateValue() {

		double e;

		if (this.salesDate < 2016) {
			e = 8 * Math.pow(10, -114) * Math.exp(0.1364 * this.salesDate);
		} else {
			e = 106067.567562 * this.salesDate + -212203364.854193;
		}
		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}

}