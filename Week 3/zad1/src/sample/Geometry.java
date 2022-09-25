package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Optional;

public class Geometry extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene(group, 300, 275);

        double centerX = scene.getWidth() / 2.0;
        double centerY = scene.getHeight() / 2.0;
        double radius = Math.min(scene.getWidth(), scene.getHeight()) / 3.0;

        Circle circle = new Circle(centerX, centerY, radius);
        circle.setStroke(Color.RED);
        circle.setFill(null);
        group.getChildren().add(circle);

        double lineX = readUserInput(scene.getWidth());

        if(lineX < 0){
            Platform.exit();
        } else {
            Line line = new Line(lineX, 0, lineX, scene.getHeight());
            line.setStroke(Color.BLUE);
            line.setStrokeWidth(2);
            group.getChildren().add(line);

            double chSquare = radius * radius - (centerX - lineX) * (centerX - lineX);
            if (chSquare >= 0){
                double intersectionOneX = centerY - Math.sqrt(chSquare);
                drawCircleWithText(lineX, intersectionOneX, group);
                if(chSquare > 0){
                    double intersectionTwoY = centerY + Math.sqrt(chSquare);
                    drawCircleWithText(lineX, intersectionTwoY, group);
                }

                primaryStage.setTitle("Circle Line Intersection");
                primaryStage.setScene(scene);
                primaryStage.show();
            } else {
                showWarningDialog();
                Platform.exit();
            }
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

    private double readUserInput(double width){
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Prompt");
        inputDialog.setHeaderText(null);
        inputDialog.setContentText("Enter x coordinate of AB line:");

        double userInput = -1;
        boolean invalid = true;

        do {
            Optional<String> userInputOptional = inputDialog.showAndWait();
            if(userInputOptional.isPresent()) {
                userInput = Double.parseDouble(userInputOptional.get());
                invalid = userInput < 0 || userInput > width;
                if (invalid) {
                    showErrorDialog(width);
                } else {
                    return userInput;
                }
            }
        } while (invalid);

        return userInput;
    }

    private void showErrorDialog(double width){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(String.format("Please enter a value between [0, %.2f]", width));
        alert.showAndWait();
    }

    private void showWarningDialog(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("No intersection.");
        alert.showAndWait();
    }

    private void drawCircleWithText(double x, double y, Group group){
        Circle circle = new Circle(x, y, 5);
        Text label = new Text(x+10, y, String.format("(%.2f; %.2f)", x, y));
        group.getChildren().addAll(circle, label);
    }
}
