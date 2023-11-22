package application;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bouncing Ball Animation");

        // Create a pane
        Pane root = new Pane();

        // Create a ball
        Circle ball = new Circle(20, Color.BLUE);
        root.getChildren().add(ball);

        // Set up translation animation
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), ball);
        translateTransition.setByX(300); // Move the ball horizontally by 300 pixels
        translateTransition.setByY(200); // Move the ball vertically by 200 pixels
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE); // Repeat indefinitely
        translateTransition.setAutoReverse(true); // Reverse the animation on each cycle

        // Start the animation
        translateTransition.play();

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}