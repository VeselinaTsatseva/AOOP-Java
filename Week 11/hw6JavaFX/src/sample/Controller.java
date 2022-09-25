package sample;

import java.net.URL;
import java.util.ResourceBundle;

import com.providers.CipherGenerator;
import com.providers.Result;
import com.providers.Wrapper;
import com.services.Cipherable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEnterSeed;

    @FXML
    private TextField txtEnterSize;

    @FXML
    private Button btnGenerateRandom;

    @FXML
    private Button btnRandomSubset;

    @FXML
    private Button btnQuit;

    @FXML
    void btnGenerateRandomOnAction(ActionEvent event) {
        Wrapper wrapper = new Wrapper(Integer.getInteger(txtEnterSize.getText()));
        Cipherable c = wrapper.makeFixedRandom();
        Result result = CipherGenerator.countDistinct(c, Integer.getInteger(txtEnterSeed.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Generate random subset A-Z");
        alert.setHeaderText("Count distinct characters out of " + txtEnterSize.getText());
        alert.setContentText(result.toString());
        alert.showAndWait();
        Platform.exit();
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnRandomSubsetOnAction(ActionEvent event) {
        Wrapper wrapper = new Wrapper(Integer.getInteger(txtEnterSize.getText()));
        Cipherable c = wrapper.makeFixedSelection();
        Result result = CipherGenerator.countDistinct(c, Integer.getInteger(txtEnterSeed.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Random subsequence of letters A-Z");
        alert.setHeaderText("Count distinct characters out of "+ txtEnterSize.getText());
        alert.setContentText(result.toString());
        alert.showAndWait();
        Platform.exit();
    }

    @FXML
    void initialize() {
        assert txtEnterSeed != null : "fx:id=\"txtEnterSeed\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtEnterSize != null : "fx:id=\"txtEnterSize\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnGenerateRandom != null : "fx:id=\"btnGenerateRandom\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnRandomSubset != null : "fx:id=\"btnRandomSubset\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
