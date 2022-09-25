/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcomejavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WelcomeJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        
        Text txtWelcome = new Text(50, 50, "Welcome to JavaFX Applications!");
        txtWelcome.setFont(Font.font("Verdana", FontWeight.BOLD,  15));
        txtWelcome.setFill(Color.BLUE);
    
        root.getChildren().add(txtWelcome);

        Scene scene = new Scene(root, 300, 250, Color.LIGHTGREY);

        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

