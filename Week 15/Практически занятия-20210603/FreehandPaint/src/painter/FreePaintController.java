package painter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class FreePaintController {
    // Smaple line thickness
    private static final int THIN_LINE = 1;
    private static final int MEDIUM_LINE = 2;
    private static final int THICK_LINE = 4;
    private double startingPointX, startingPointY,
                   endPointX, endPointY;
    // instance variables for managing the FreePaint drawing
    private int   lineStroke;  //  line thickness  
    private Paint lineColor; //  line color

    @FXML     private ResourceBundle resources;
    @FXML     private URL location;
    
    @FXML     private MenuItem mnuBlack;
    @FXML     private MenuItem mnuRed;
    @FXML     private MenuItem mnuGreen;
    @FXML     private MenuItem mnuBlue;
    @FXML     private MenuItem mnuSmall;
    @FXML     private MenuItem mnuMedium;
    @FXML     private MenuItem mnuLarge;
    
    @FXML     private RadioButton rbtBlack;
    @FXML     private ToggleGroup tglColor;
    @FXML     private RadioButton rbtRed;
    @FXML     private RadioButton rbtGreen;
    @FXML     private RadioButton rbtBlue;
    @FXML     private RadioButton rbtSmall;
    @FXML     private ToggleGroup tglSize;
    @FXML     private RadioButton rbtMedium;
    @FXML     private RadioButton rbtLarge;
    
    @FXML     private Button btnUndo;
    @FXML     private Button btnClear;
    @FXML     private AnchorPane drawingAreaAnchorPane;
    
    @FXML
    private void clearButtonPressed(ActionEvent event) {
        // clear the drawing area on AnchorPane
        drawingAreaAnchorPane.getChildren().clear(); 
    }

    @FXML
    private void colorMenuSelected(ActionEvent event) {
        // user data for each color RadioButton is the corresponding Color
        lineColor
                = (Color) ((MenuItem) event.getSource()).getUserData();
    }

    @FXML
    private void colorRadioButtonSelected(ActionEvent event) {
        // user data for each color RadioButton is the corresponding Color
        lineColor
                = (Color) tglColor.getSelectedToggle().getUserData();
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        endPointX = event.getX();
        endPointY = event.getY();
        Line line = new Line(startingPointX, startingPointY, endPointX, endPointY);
        line.setStroke(lineColor);
        line.setStrokeWidth(lineStroke); 
        drawingAreaAnchorPane.getChildren().add(line);
        startingPointX= endPointX;
        startingPointY =endPointY;  
    }
//       Circle newCircle = new Circle(event.getX(), event.getY(),
   //                                                     lineStroke, lineColor);}
//        drawingAreaAnchorPane.getChildren().add(newCircle); 
    @FXML
    void drawingAreaMousePressed(MouseEvent event) {
      startingPointX = event.getX();
      startingPointY = event.getY();
    }

    @FXML
    void drawingAreaMouseReleased(MouseEvent event) {

    }
    @FXML
    private void sizeMenuSelected(ActionEvent event) {
        // user data for each lineStroke RadioButton is the corresponding thickness
        lineStroke
                = (int) ((MenuItem) event.getSource()).getUserData();
    }

    @FXML
    private void sizeRadioButtonSelected(ActionEvent event) {
        // user data for each lineStroke RadioButton is the corresponding thickness
        lineStroke
                = (int) tglSize.getSelectedToggle().getUserData();
    }

    @FXML
    private  void undoButtonPressed(ActionEvent event) {
        int count = drawingAreaAnchorPane.getChildren().size();
        // if there are any shapes remove the last one added
        if (count > 0) {
            drawingAreaAnchorPane.getChildren().remove(count - 1);
        }
    }

    @FXML
    private void initialize() {
    // default values   
        lineStroke = FreePaintController.MEDIUM_LINE;  // default thickness
        lineColor = Color.BLACK;                       // default  color

    //  Initialize the userData property  
        mnuBlack.setUserData(Color.BLACK);
        rbtBlack.setUserData(Color.BLACK);
        mnuRed.setUserData(Color.RED);
        rbtRed.setUserData(Color.RED);
        mnuGreen.setUserData(Color.GREEN);
        rbtGreen.setUserData(Color.GREEN);
        mnuBlue.setUserData(Color.BLUE);
        rbtBlue.setUserData(Color.BLUE);
        mnuSmall.setUserData(FreePaintController.THIN_LINE);
        rbtSmall.setUserData(FreePaintController.THIN_LINE);
        mnuMedium.setUserData(FreePaintController.MEDIUM_LINE);
        rbtMedium.setUserData(FreePaintController.MEDIUM_LINE);
        mnuLarge.setUserData(FreePaintController.THICK_LINE);
        rbtLarge.setUserData(FreePaintController.THICK_LINE);
    }
}