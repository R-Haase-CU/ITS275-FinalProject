
package finalProject;

public abstract class HonusCard {

	int quality, salesDate, estimatedValue;
	int[][] salesHistory;

	public HonusCard() {
		// Default Constructor
	}

	public abstract void estimateValue();


}