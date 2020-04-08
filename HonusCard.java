package application;

public abstract class HonusCard {

	// abstract object class
	// initialized variables for sub-classes
	int quality, salesDate, estimatedValue;
	int[][] salesHistory;

	// default constructor
	public HonusCard() {
	}

	// abstract method
	public abstract void estimateValue();

}