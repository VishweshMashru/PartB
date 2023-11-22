package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Intermediate JavaFX Example");

        // Create a VBox for vertical arrangement
        VBox vbox = new VBox();
        vbox.setSpacing(10);

        // Create a Label
        Label label = new Label("Click the button to change the text!");

        // Create a Button with an event handler
        Button button = new Button("Click me!");
        button.setOnAction(event -> {
            // Change the text of the label when the button is clicked
            label.setText("Button clicked!");
        });

        // Add the Label and Button to the VBox
        vbox.getChildren().addAll(label, button);

        // Create a Scene
        Scene scene = new Scene(vbox, 300, 200);

        // Set the Scene to the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }
}
