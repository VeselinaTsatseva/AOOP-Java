package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene(group, 300, 275);

        double middleWidth = scene.getWidth() / 2;
        double middleHeight = scene.getHeight() / 2;

        for (int i = 0; i < 5 ; i++)
        {
            Line line1 = new Line(middleWidth + (20 * i), middleHeight - (20 * i), middleWidth + (20 * i), middleHeight + 20 + (20 * i));
            line1.setStroke(Color.ORANGE);
            line1.setStrokeWidth(2);

            Line line2 = new Line(middleWidth + (20 * i), middleHeight + 20 + (20 * i), middleWidth - 20 - (20 * i), middleHeight + 20 + (20 * i));
            line2.setStroke(Color.ORANGE);
            line2.setStrokeWidth(2);

            Line line3 = new Line(middleWidth - 20 - (20 * i), middleHeight + 20 + (20 * i), middleWidth - 20 - (20 * i), middleHeight - 20 - (20 * i));
            line3.setStroke(Color.ORANGE);
            line3.setStrokeWidth(2);

            Line line4 = new Line(middleWidth - 20 - (20 * i), middleHeight - 20 - (20 * i), middleWidth + 20 + (20 * i), middleHeight - 20 - (20 * i));
            line4.setStroke(Color.ORANGE);
            line4.setStrokeWidth(2);

            group.getChildren().addAll(line1, line2, line3, line4);
        }

        primaryStage.setTitle("Draw square shaped spiral");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
