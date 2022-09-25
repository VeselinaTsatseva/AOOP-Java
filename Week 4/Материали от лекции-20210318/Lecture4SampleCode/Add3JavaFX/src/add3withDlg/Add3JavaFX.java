/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add3withDlg;

import java.util.Optional;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 *
 * @author echrk
 */
public class Add3JavaFX extends Application {
    // Simple dialog window for displaying messages
    private static Alert alertInfo = new Alert(AlertType.INFORMATION);
    // Dialog window for displaying messages with confirm and reject options
    private static Alert alertConfirm = new Alert(AlertType.CONFIRMATION);
    // Input text dialog window
    private static TextInputDialog dialog = new TextInputDialog();
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    //ClassName.messageDialog("YOUR INFORMATION HERE", "TITLE BAR MESSAGE", "HEADER MESSAGE");
    // Info message dialog with a header
    public static void messageDialog(String infoMessage,
                                     String titleBar, String headerMessage) {

        alertInfo.setTitle(titleBar);
        alertInfo.setHeaderText(headerMessage);
        alertInfo.setContentText(infoMessage);
        alertInfo.showAndWait();
    }
    //ClassName.messageDialog("YOUR INFORMATION HERE", "TITLE BAR MESSAGE");
    // Info message dialog without a header
    public static void plainMessageDialog(String infoMessage, String titleBar) {
        /* By specifying a null headerMessage String, we cause the dialog to
           not have a header */
        messageDialog(infoMessage, titleBar, null);
    }


    // Info message dialog with a confirmation
    public static ButtonType confirmDialog(String infoMessage, 
                      String titleBar, String headerMessage) {
        alertConfirm.setTitle(titleBar);
        alertConfirm.setHeaderText(headerMessage);
        alertConfirm.setContentText(infoMessage);
        //Optional<ButtonType> result = alertConfirm.showAndWait();
        var result = alertConfirm.showAndWait();
        return result.get();
    }
//        
//        if (result.get() == ButtonType.OK) {
//            // ... user chose OK
//        } else {//result.get() == ButtonType.CANCEL
//            // ... user chose CANCEL or closed the dialog
//        }
    public static String inputDialog(String infoMessage, String titleBar, 
                                     String headerMessage) {

        dialog.setTitle(titleBar);
        dialog.setHeaderText(headerMessage);
        dialog.setContentText(infoMessage);
       // Traditional way to get the response value.
       // Optional<String> result = dialog.showAndWait();
        var result = dialog.showAndWait();
        if (result.isPresent()) {
            return result.get();
        }
        else
           return  null;
    }
}
