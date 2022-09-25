/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputbox;

import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class InputBoxesWithJavaFX extends Application {

    public static void messageDialog(String infoMessage,
            String titleBar, String headerMessage) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }

    public static String inputDialog(String infoMessage, String titleBar, 
                                     String headerMessage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(titleBar);
        dialog.setHeaderText(headerMessage);
        dialog.setContentText(infoMessage);
        // Traditional way to get the response value.
//        Optional<String> result = dialog.showAndWait();
//        if (result.isPresent()) {
//            return result.get();
//        }
//        else
//           return  null;
        return dialog.showAndWait().get();
    }

    @Override
    public void start(Stage primaryStage) {

        String name = inputDialog("What is your name?", "User input", null);
        // create the message
        String message = String.format("Welcome, %s, to JavaFX Programming!", name);
        // display the message to welcome the user by name 
        messageDialog(message, "Name dialog", "Reply");
        Platform.exit(); // quit the javaFX application
    }

    public static void main(String[] args) {
        launch(args);
    }
}
