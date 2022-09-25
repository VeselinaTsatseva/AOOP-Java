/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.beans.value.ChangeListener;

/**
 *
 * @author echrk
 */
public class FXMLDocumentController implements Initializable {
    // formatters for CURRENCY and percentages

    private static final NumberFormat CURRENCY = NumberFormat.getCurrencyInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblAmount;

    @FXML
    private Label lblTip;

    @FXML
    private Label lblTotal;

    @FXML
    private TextField txtPrincipalAmount;

    @FXML
    private TextField txtInterestRate;

    @FXML
    private TextField txtTotalDeposit;

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnQuit;

    @FXML
    private TextField txtNumberYears;

    @FXML
    void btnQquitOnAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnCalculateOnAction(ActionEvent event) {
        try {
            BigDecimal principalAmount = new BigDecimal(txtPrincipalAmount.getText());
            int years = Integer.parseInt(txtNumberYears.getText()); 
            BigDecimal interestRate = new BigDecimal(txtInterestRate.getText());
            BigDecimal term = new BigDecimal(1);
            interestRate =  interestRate.add( new BigDecimal(1.));
            for (int i = 0; i < years; i++) {
                term = term.multiply(interestRate);
            }
            BigDecimal total = principalAmount.multiply(term);
            txtTotalDeposit.setText(CURRENCY.format(total));
        } catch (NumberFormatException ex) {
            txtPrincipalAmount.setText("Enter amount");
            txtPrincipalAmount.selectAll();
            txtPrincipalAmount.requestFocus();
        }
    }

    public void initialize(URL url, ResourceBundle rb) {
        CURRENCY.setRoundingMode(RoundingMode.HALF_UP);  
    }
    
}
