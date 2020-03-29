package finalProject;

public class VeryGoodCard extends HonusCard {

	public VeryGoodCard() {

		quality = 3;

		salesHistory = SalesHistoryDatabase.VeryGood;
	}

	@Override
	public void estimateValue() {

		double e;

		if (this.salesDate < 2012) {
			// replace w/ exponential equation
			e = 106067.567562 * this.salesDate + -212203364.854193;
		} else {
			e = 106067.567562 * this.salesDate + -212203364.854193;
		}
		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}

}
