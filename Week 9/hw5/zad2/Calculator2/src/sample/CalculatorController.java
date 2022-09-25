
package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

    public class CalculatorController {

        private double result;
        private double data;
        private double memory;
        int operation = -1;

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private GridPane pnlCalculator2;

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
        void btnAddOnAction(ActionEvent event) {
            data = Double.parseDouble(txtField.getText());
            operation = 1;
            txtField.setText("");
        }

        @FXML
        void btnSubstractOnAction(ActionEvent event) {
            data = Double.parseDouble(txtField.getText());
            operation = 2;
            txtField.setText("");
        }

        @FXML
        void btnMultiplyOnAction(ActionEvent event) {
            data = Double.parseDouble(txtField.getText());
            operation = 3;
            txtField.setText("");
        }

        @FXML
        void btnDivisionOnAction(ActionEvent event) {
            data = Double.parseDouble(txtField.getText());
            operation = 4;
            txtField.setText("");
        }

        @FXML
        void btnPercentageOnAction(ActionEvent event) {
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
        void btnMMinusOnAction(ActionEvent event) {
            memory = memory - Double.parseDouble(txtField.getText());
            txtField.setText("0");
        }

        @FXML
        void btnMOnAction(ActionEvent event) {
            memory = Double.parseDouble(txtField.getText());
        }

        @FXML
        void btnMPlusOnAction(ActionEvent event) {
            memory = memory + Double.parseDouble(txtField.getText());
            txtField.setText("0");
        }

        @FXML
        void btnMcOnAction(ActionEvent event) {
            memory = 0.0f;
            txtField.setText("");
        }

        @FXML
        void btnResultOnACtion(ActionEvent event) {
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
            assert pnlCalculator2 != null : "fx:id=\"pnlCalculator2\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnC != null : "fx:id=\"btnC\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnMMinus != null : "fx:id=\"btnMMinus\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnMPlus != null : "fx:id=\"btnMPlus\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnM != null : "fx:id=\"btnM\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnNine != null : "fx:id=\"btnNine\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnSquareRoot != null : "fx:id=\"btnSquareRoot\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnDivision != null : "fx:id=\"btnDivision\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnPercentage != null : "fx:id=\"btnPercentage\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnMultiply != null : "fx:id=\"btnMultiply\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnSix != null : "fx:id=\"btnSix\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnResult != null : "fx:id=\"btnResult\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnSubstract != null : "fx:id=\"btnSubstract\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnThree != null : "fx:id=\"btnThree\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnDot != null : "fx:id=\"btnDot\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnMC != null : "fx:id=\"btnMC\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnSeven != null : "fx:id=\"btnSeven\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnEight != null : "fx:id=\"btnEight\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnCA != null : "fx:id=\"btnCA\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnFour != null : "fx:id=\"btnFour\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnFive != null : "fx:id=\"btnFive\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnOne != null : "fx:id=\"btnOne\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnTwo != null : "fx:id=\"btnTwo\" was not injected: check your FXML file 'CalculatorScene.fxml'.";
            assert btnZero != null : "fx:id=\"btnZero\" was not injected: check your FXML file 'CalculatorScene.fxml'.";

        }
    }
