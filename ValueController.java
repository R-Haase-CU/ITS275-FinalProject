package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class ValueController {
	
	public Slider valueSlider;
	public TextField dateInput;
	public Label valueOutput;
	public Button runButton;
	
	
	public void buttonClick() {
		
//		double quality = valueSlider.getValue();
//		System.out.println(quality);
//		System.out.println(valueSlider.getValue());
		
		System.out.println(dateInput.getText());
		
		valueOutput.setText("Hello");
		
	}

}
