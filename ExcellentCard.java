package application;

public class ExcellentCard extends HonusCard {

	public ExcellentCard() {

		quality = 4;

		salesHistory = SalesHistoryDatabase.Exellent;
	}

	@Override
	public void estimateValue() {

		double e;

		if (salesDate < 2011) {
			e = 9 * Math.pow(10, -105) * Math.exp(0.1265 * this.salesDate);
		} else {
			e = (106760) * this.salesDate + -212108160;
		}

		this.estimatedValue = (int) (Math.round(e / 1000.0) * 1000);
	}

}