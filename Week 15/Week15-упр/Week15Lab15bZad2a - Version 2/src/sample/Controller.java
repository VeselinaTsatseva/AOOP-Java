package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblR;

    @FXML
    private Label lblG;

    @FXML
    private Label lblB;

    @FXML
    private Label lblOpacity;

    @FXML
    private Slider sldR;

    @FXML
    private Slider sldG;

    @FXML
    private Slider sldB;

    @FXML
    private Slider sldOpacity;

    @FXML
    private Pane pnlPreview;

    @FXML
    void initialize() {
        assert lblR != null : "fx:id=\"lblR\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblG != null : "fx:id=\"lblG\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblB != null : "fx:id=\"lblB\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblOpacity != null : "fx:id=\"lblOpacity\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldR != null : "fx:id=\"sldR\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldG != null : "fx:id=\"sldG\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldB != null : "fx:id=\"sldB\" was not injected: check your FXML file 'sample.fxml'.";
        assert sldOpacity != null : "fx:id=\"sldOpacity\" was not injected: check your FXML file 'sample.fxml'.";
        assert pnlPreview != null : "fx:id=\"pnlPreview\" was not injected: check your FXML file 'sample.fxml'.";

        StringBinding styleBinding = new StringBinding() {
            {
                super.bind(sldR.valueProperty(), sldG.valueProperty(), sldB.valueProperty(),
                        sldOpacity.valueProperty());
            }

            @Override
            protected String computeValue() {
                return String.format("-fx-border-color: black;-fx-background-color: rgb(%.2f, %.2f, %.2f, %.2f)",
                        sldR.valueProperty().get(), sldG.valueProperty().get(), sldB.valueProperty().get(),
                        sldOpacity.valueProperty().get());
            }
        };
        pnlPreview.styleProperty().bind(styleBinding);
    }
}
