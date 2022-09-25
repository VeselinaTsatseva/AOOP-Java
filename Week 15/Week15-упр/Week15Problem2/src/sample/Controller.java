package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Rectangle shape;

    @FXML
    private Slider sldR;

    @FXML
    private Slider sldG;

    @FXML
    private Slider sldB;

    @FXML
    private Slider sldOpacity;

    @FXML
    void initialize() {
        assert shape != null : "fx:id=\"shape\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldR != null : "fx:id=\"sldR\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldG != null : "fx:id=\"sldG\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldB != null : "fx:id=\"sldB\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldOpacity != null : "fx:id=\"sldOpacity\" was not injected: check your FXML file 'sample.fxml'.";

        ChangeListener<Number> changeListener = ((observableValue, oldValue, newValue) ->
                shape.setFill(Color.rgb((int) sldR.getValue(), (int) sldG.getValue(), (int) sldB.getValue(),
                        sldOpacity.getValue())));

        sldR.valueProperty().addListener(changeListener);
        sldG.valueProperty().addListener(changeListener);
        sldB.valueProperty().addListener(changeListener);
        sldOpacity.valueProperty().addListener(changeListener);
    }
}
