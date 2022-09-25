package standardmenu;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;

public class FXMLDocumentController {

    private Locale locale;
    private Alert mb;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem mniEngliishLocale;

    @FXML
    private MenuItem mniBulgarianLocale;

    @FXML
    private MenuItem mniQuit;

    @FXML
    void mniBulgarianLocaleOnAction(ActionEvent event) {
        locale = new Locale("bg", "BG");
        Locale.setDefault(locale);
        mb.setContentText(locale.getDisplayName(locale));
        mb.showAndWait();
    }
    @FXML
    void mniEngliishLocaleOnAction(ActionEvent event) {
        locale = Locale.ENGLISH;
        Locale.setDefault(locale);
        mb.setContentText(locale.getDisplayName(locale));
        mb.showAndWait();
    }
    @FXML
    void mniQuitOnAction(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    void initialize() {
        locale = Locale.ENGLISH;
        mb = new Alert(Alert.AlertType.INFORMATION);
        mb.setTitle("Selected Locale");
        mb.setHeaderText("Locale:");
        mb.setContentText(locale.getDisplayName(locale));
    }
}
