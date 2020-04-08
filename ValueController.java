package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class ValueController {

	// Declare the variables that are going to be used in the FXML file
	// The variable type and name match the type and ID in the FXML file
	public Slider valueSlider;
	public TextField dateInput;
	public Label valueOutput;
	public Button runButton;
	public Label instructionsDate;

	public void buttonClick() {

		// declare int variable "quality" and set its value equal to the value of the
		// valueSlider
		// converts the double value to an int value
		int quality = (int) valueSlider.getValue();

		// There are multiple print commands throughout the controller to display in the
		// controller what data has been passed though the scene
		System.out.println(quality);

		// Switch statement to select the correct constructor for the HonusCard object
		// based on variable "quality"
		// Object is initialized with a null value because it cannot be initialized
		// multiple times (in multiple switch cases)
		HonusCard userCard = null;
		switch (quality) {
		case 1:
			userCard = new PoorCard();
			System.out.println("Quality = 1");
			break;
		case 2:
			userCard = new GoodCard();
			System.out.println("Quality = 2");
			break;
		case 3:
			userCard = new VeryGoodCard();
			System.out.println("Quality = 3");
			break;
		case 4:
			userCard = new ExcellentCard();
			System.out.println("Quality = 4");
			break;
		}

		try {
			// this will try to convert the string from the text field into an int value
			// and store it as the salesDate attribute of the object "user"
			// if it doesn't work, the number format exception handler will catch the error
			System.out.println(dateInput.getText() + "\n");
			userCard.salesDate = Integer.parseInt(dateInput.getText());

			// Check date to make sure that it is in the range of valid values
			// Displays different messages based on the date range
			if (userCard.salesDate < 1909) {
				valueOutput.setText("The T206 Honus Wagner card did not exist before 1909");
			} else if (userCard.salesDate >= 1909 && userCard.salesDate <= 1911) {
				valueOutput.setText("The card was sold with cigerette boxes until Wagner said \"NO MORE\" in 1911, "
						+ "only 50-200 were ever printed");
			} else if (userCard.salesDate > 1911 && userCard.salesDate < 1985) {
				valueOutput.setText(
						"Nobody really cared about the card until 1985, when it sold for a good chunk of money");
			} else {
				System.out.println("your card will be evaluated");
				// sends the userCard object to the returnStuff method for evaluation
				valueOutput.setText(FindValue.returnStuff(userCard));
			}

		} catch (NumberFormatException nfe) {
			valueOutput.setText("Make sure you enter a valid year");
		}

	}

}