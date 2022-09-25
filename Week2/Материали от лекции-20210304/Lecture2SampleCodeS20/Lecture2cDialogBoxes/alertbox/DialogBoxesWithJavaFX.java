/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertbox;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DialogBoxesWithJavaFX extends Application {

    public static void messageDialog(String infoMessage,
            String titleBar, String headerMessage) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }

    @Override
    public void start(Stage primaryStage) {

        messageDialog("Welcome\nto\nJava", "Information Alert box", null);
        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
