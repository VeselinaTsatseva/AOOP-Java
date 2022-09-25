package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller extends AnchorPane {

    private double result;
    private double data;
    private double memory;
    int operation = -1;

    public Controller(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/sample.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtField;

    @FXML
    private Button btnC;

    @FXML
    private Button btnMMinus;

    @FXML
    private Button btnMPlus;

    @FXML
    private Button btnM;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnSquareRoot;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnPercentage;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnResult;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnSubstract;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnMC;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnCA;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    void btnDotOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + '.');
    }

    @FXML
    void btnEightOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 8);
    }

    @FXML
    void btnFiveOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 5);
    }

    @FXML
    void btnFourOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 4);
    }

    @FXML
    void btnThreeOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 3);
    }

    @FXML
    void btnTwoOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 2);
    }

    @FXML
    void btnZeroOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 0);
    }

    @FXML
    void btnNineOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 9);
    }

    @FXML
    void btnOneOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 1);
    }

    @FXML
    void btnSevenOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 7);
    }

    @FXML
    void btnSixOnAction(ActionEvent event) {
        txtField.setText(txtField.getText() + 6);
    }

    @FXML
    void btnCAOnAction(ActionEvent event) {
        txtField.clear();
    }

    @FXML
    void btnCOnAction(ActionEvent event) {
        txtField.clear();
    }

    @FXML
    void btnAddOnAction(ActionEvent event) {   // +
        data = Double.parseDouble(txtField.getText());
        operation = 1;
        txtField.setText("");
    }

    @FXML
    void btnDivisionOnAction(ActionEvent event) {  // /
        data = Double.parseDouble(txtField.getText());
        operation = 4;
        txtField.setText("");
    }

    @FXML
    void btnSubstractOnAction(ActionEvent event) {  // -
        data = Double.parseDouble(txtField.getText());
        operation = 2;
        txtField.setText("");
    }

    @FXML
    void btnMultiplyOnAction(ActionEvent event) {   // *
        data = Double.parseDouble(txtField.getText());
        operation = 3;
        txtField.setText("");
    }

    @FXML
    void btnPercentageOnAction(ActionEvent event) {   // %
        data = Double.parseDouble(txtField.getText());
        operation = 5;
        txtField.setText("");
    }

    @FXML
    void btnSquareRootOnAction(ActionEvent event) {
        data = Double.parseDouble(txtField.getText());
        operation = 6;
        txtField.setText("");
    }


    @FXML
    void btnMPlusOnAction(ActionEvent event) {  // M+
        memory = memory + Double.parseDouble(txtField.getText());
        txtField.setText("0");
    }


    @FXML
    void btnMMinusOnAction(ActionEvent event) {  // M-
        memory = memory - Double.parseDouble(txtField.getText());
        txtField.setText("0");

    }

    @FXML
    void btnMcOnAction(ActionEvent event) {   // MC
        memory = 0.0f;
        txtField.setText("");
    }

    @FXML
    void btnMOnAction(ActionEvent event) {   // M
        memory = Double.parseDouble(txtField.getText());
    }

    @FXML
    void btnResultOnAction(ActionEvent event) {
        Double secondOp = Double.parseDouble(txtField.getText());
        switch (operation) {
            case 1:   //  +
                result = data + secondOp;
                txtField.setText(String.valueOf(result));
                break;
            case 2:   //  -
                result = data - secondOp;
                txtField.setText(String.valueOf(result));
                break;
            case 3:   //  *
                result = data * secondOp;
                txtField.setText(String.valueOf(result));
                break;
            case 4:   //  /
                result = data / secondOp;
                txtField.setText(String.valueOf(result));
                break;
            case 5:
                result = data * (secondOp / 100);
                txtField.setText(String.valueOf(result));
                break;
            case 6:
                result = Math.sqrt(data);
                txtField.setText(String.valueOf(result));
                break;
        }
    }


    @FXML
    void initialize() {
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMPlus != null : "fx:id=\"btnMPlus\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnM != null : "fx:id=\"btnMS\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnNine != null : "fx:id=\"btnNine\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSquareRoot != null : "fx:id=\"btnSquareRoot\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDivision != null : "fx:id=\"btnDivision\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnPercentage != null : "fx:id=\"btnPercentage\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMultiply != null : "fx:id=\"btnMultiply\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSix != null : "fx:id=\"btnSix\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnResult != null : "fx:id=\"btnResult\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSubstract != null : "fx:id=\"btnSubstract\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnMC != null : "fx:id=\"btnMC\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSeven != null : "fx:id=\"btnSeven\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnEight != null : "fx:id=\"btnEight\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnCA != null : "fx:id=\"btnCA\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnFive != null : "fx:id=\"btnFive\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnOne != null : "fx:id=\"btnOne\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnZero != null : "fx:id=\"btnZero\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
