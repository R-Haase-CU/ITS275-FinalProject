package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// sets root as an HBox that is linked to my FXML file
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("UXValue.fxml"));
			// Creates scene based on the root with a windows size of 800x400
			Scene scene = new Scene(root, 800, 400);
			// sets the primary stage to the Scene called "scene"
			primaryStage.setScene(scene);
			primaryStage.show();
			// Changes the title of the program window
			primaryStage.setTitle("Honus Wagner Card Man 2.0");
			// Sets the program icon so that it is different from the default icon
			primaryStage.getIcons().add(new Image("File:../../HonusIcon.png"));
			// Prevents resizing of the window
			// I chose to do this because I didn't make the program scale very well
			primaryStage.setResizable(false);
			primaryStage.sizeToScene();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// launches the application which hands control over to the controller
		launch(args);
	}
}