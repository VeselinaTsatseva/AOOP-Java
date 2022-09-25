package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();     // create a layout Panel
        Scene scene = new Scene(group, 600, 500);

        double width = scene.getWidth();  // width of the scene
        double height = scene.getHeight();  // height of the scene

        drawLines1(group, width, height);
        drawLines2(group, width, height);

        // set the title of the Stage
        primaryStage.setTitle("Canvas demo");

        //add the Scene to the Stage
        primaryStage.setScene(scene);

        //show the Stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void drawLines1(Group group, double width, double height)
    {
        double x = 0;
        double y = 0;

        for (int i = 1; i <= 12; i++)
        {
            Line line1 = new Line(0, 0, width, x);
            line1.setStroke(Color.CORAL);
            Line line2 = new Line(0, height, y, 0);
            line2.setStroke(Color.CORAL);
            Line line3 = new Line(width, height, 0, height-x);
            line3.setStroke(Color.CORAL);
            Line line4 = new Line(width, 0, width-x, height);
            line4.setStroke(Color.CORAL);
            group.getChildren().addAll(line1, line2, line3, line4);
            x += 20;
            y += 20;
        }
    }

    public void drawLines2(Group group, double width, double height)
    {
        double x = 0;
        double y = 0;

        for (int i = 1; i <= 12; i++)
        {
            Line line1 = new Line(0, 0, x, height);
            line1.setStroke(Color.CORAL);
            Line line2 = new Line(0, height, width, height-y);
            line2.setStroke(Color.CORAL);
            Line line3 = new Line(width, height, width-x, 0);
            line3.setStroke(Color.CORAL);
            Line line4 = new Line(width, 0, 0, y);
            line4.setStroke(Color.CORAL);
            group.getChildren().addAll(line1, line2, line3, line4);
            x += 20;
            y += 20;
        }
    }
}
