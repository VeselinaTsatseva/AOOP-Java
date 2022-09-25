package add3javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblSecondNumber;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnComputeSum;

    @FXML
    private Label lblResult;

    @FXML
    private Label lblFirstNumber;

    @FXML
    private TextField txtSecondNumber;

    @FXML
    private TextField txtResult;

    @FXML
    private Label lblThirdNumber;

    @FXML
    private TextField txtFirstNumber;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtThirdNumber;

   @FXML
    void btnClearOnAction(ActionEvent event) {
        txtFirstNumber.setText("0");
        txtSecondNumber.setText("0");
        txtThirdNumber.setText("0");
        txtResult.setText("0");
    }

    @FXML
    void btnComputeSumOnAction(ActionEvent event) {
        int firstNum = Integer.parseInt(txtFirstNumber.getText());
        int secondNum = Integer.parseInt(txtSecondNumber.getText());
        int thirdNum = Integer.parseInt(txtThirdNumber.getText());
        // b)
        int sum = firstNum + secondNum + thirdNum;
        // c)
        txtResult.setText(String.format("%d", sum));
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
       System.exit(0); // Terminate the JavaFX application
    }

    @FXML
    void initialize() {
        assert lblSecondNumber != null : "fx:id=\"lblSecondNumber\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert btnComputeSum != null : "fx:id=\"btnComputeSum\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblResult != null : "fx:id=\"lblResult\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblFirstNumber != null : "fx:id=\"lblFirstNumber\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert txtSecondNumber != null : "fx:id=\"txtSecondNumber\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblThirdNumber != null : "fx:id=\"lblThirdNumber\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert txtFirstNumber != null : "fx:id=\"txtFirstNumber\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert txtThirdNumber != null : "fx:id=\"txtThirdNumber\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
}
