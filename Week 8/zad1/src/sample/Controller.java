package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblNameError;

    @FXML
    private Label lblPhoneNumberError;

    @FXML
    private Label lblEmailAddressError;

    @FXML
    private Label lblPasswordError;

    @FXML
    private Label lblConfirmPasswordError;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtEmailAddress;

    @FXML
    private Button btnRegister;

    @FXML
    private PasswordField pwdPassword;

    @FXML
    private PasswordField pwdConfirmPassword;

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        boolean isFormValid = validateForm();
        if (isFormValid){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText(null);
            alert.setContentText("Successfully registered!");
            alert.showAndWait();
            Platform.exit();
        }
    }

    @FXML
    void initialize() {
        assert lblNameError != null : "fx:id=\"lblNameError\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblPhoneNumberError != null : "fx:id=\"lblPhoneNumberError\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblEmailAddressError != null : "fx:id=\"lblEmailAddressError\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblPasswordError != null : "fx:id=\"lblPasswordError\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblConfirmPasswordError != null : "fx:id=\"lblConfirmPasswordError\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtPhoneNumber != null : "fx:id=\"txtPhoneNumber\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtEmailAddress != null : "fx:id=\"txtEmailAddress\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnRegister != null : "fx:id=\"btnRegister\" was not injected: check your FXML file 'sample.fxml'.";
        assert pwdPassword != null : "fx:id=\"pwdPassword\" was not injected: check your FXML file 'sample.fxml'.";
        assert pwdConfirmPassword != null : "fx:id=\"pwdConfirmPassword\" was not injected: check your FXML file 'sample.fxml'.";

    }

    private boolean validateForm(){
        boolean nameRequired = validateRequired(txtName, lblNameError);
        boolean namePattern = validateNamePattern();
        boolean phoneNumberRequired = validateRequired(txtPhoneNumber, lblPhoneNumberError);
        boolean phoneNumberPattern = validatePhonePattern();
        boolean emailAddressRequired = validateRequired(txtEmailAddress, lblEmailAddressError);
        boolean emailAddressPattern = validateEmailPattern();
        boolean passwordRequired = validateRequired(pwdPassword, lblPasswordError);
        boolean confirmPasswordMatches = validateConfirmPassword();
        boolean confirmPasswordRequired = validateRequired(pwdConfirmPassword, lblConfirmPasswordError);

        return nameRequired && namePattern &&
                phoneNumberPattern && phoneNumberRequired &&
                emailAddressPattern && emailAddressRequired &&
                passwordRequired &&
                confirmPasswordMatches && confirmPasswordRequired;
    }

    private boolean validateRequired(TextField txtField, Label lblFieldError){
        String userInput = txtField.getText();
        lblFieldError.setText("");
        boolean isInvalid = userInput.equals("");
        if (isInvalid){
            lblFieldError.setText("Required ");
        }
        return !isInvalid;
    }

    private boolean validateNamePattern(){
        if (lblNameError.getText().length() > 0){
            return false;
        }
        String userInput = txtName.getText();
        boolean isInvalid = !userInput.matches("[a-zA-Z]{2,}");
        if (isInvalid){
            lblNameError.setText("Invalid name!");
        }
        return !isInvalid;
    }

    private boolean validatePhonePattern(){
        if (lblPhoneNumberError.getText().length() > 0){
            return false;
        }
        String userInput = txtPhoneNumber.getText();
        boolean isInvalid = !userInput.matches("\\(\\d{4}\\) \\(\\d{7}\\)");
        if (isInvalid){
            lblPhoneNumberError.setText("Invalid phone number!");
        }
        return !isInvalid;
    }

    private boolean validateEmailPattern(){
        if (lblEmailAddressError.getText().length() > 0){
            return false;
        }
        String userInput = txtEmailAddress.getText();
        boolean isInvalid = !userInput.matches("([\\w-]+[.]?)+@[\\w-]+[.][a-zA-Z]{2,4}");
        if (isInvalid){
            lblEmailAddressError.setText("Invalid email address!");
        }
        return !isInvalid;
    }

    private boolean validateConfirmPassword(){
        if (lblConfirmPasswordError.getText().length() > 0){
            return false;
        }
        String userInput = pwdConfirmPassword.getText();
        boolean isInvalid = !userInput.equals(pwdPassword.getText());
        if (isInvalid){
            lblConfirmPasswordError.setText("Passwords should match!");
        }
        return !isInvalid;
    }
}
