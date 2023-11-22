package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Canvas Example");

        // Create a border pane
        BorderPane borderPane = new BorderPane();

        // Create a canvas
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setLineWidth(2.0);
        graphicsContext.setStroke(Color.BLACK);

        // Add mouse event handlers for drawing
        canvas.setOnMousePressed(e -> {
            graphicsContext.beginPath();
            graphicsContext.moveTo(e.getX(), e.getY());
            graphicsContext.stroke();
        });

        canvas.setOnMouseDragged(e -> {
            graphicsContext.lineTo(e.getX(), e.getY());
            graphicsContext.stroke();
        });

        // Add the canvas to the center of the border pane
        borderPane.setCenter(canvas);

        // Create a scene
        Scene scene = new Scene(borderPane, 400, 300);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
