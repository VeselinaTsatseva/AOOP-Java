package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Slider sldInput;

    @FXML
    private Label lblInput;

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtinput\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldInput != null : "fx:id=\"sldinput\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblInput != null : "fx:id=\"lblinput\" was not injected: check your FXML file 'sample.fxml'.";

        //Fluent API
//        txtInput.textProperty().bind(sldInput.valueProperty().asString("%.2f"));
//        lblInput.textProperty().bind(sldInput.valueProperty().asString("%.2f"));

        //static methods of class Bindings
//        txtInput.textProperty().bind(Bindings.format("%.2f", sldInput.valueProperty()));
//        lblInput.textProperty().bind(Bindings.format("%.2f", sldInput.valueProperty()));

        //low level binding
//        StringBinding binding = new StringBinding() {
//            {
//                super.bind(sldInput.valueProperty());
//            }
//            @Override
//            protected String computeValue() {
//                return String.format("%.2f", sldInput.valueProperty().get());
//            }
//        };
//
//        txtInput.textProperty().bind(binding);
//        lblInput.textProperty().bind(binding);

        //Change Listener - anonymous class
//        sldInput.valueProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
//                txtInput.setText(String.format("%.2f", newValue));
//                lblInput.setText(String.format("%.2f", newValue));
//            }
//        });

        //Change Listener - lambda
        sldInput.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            txtInput.setText(String.format("%.2f", newValue));
            lblInput.setText(String.format("%.2f", newValue));
        });
    }
}
