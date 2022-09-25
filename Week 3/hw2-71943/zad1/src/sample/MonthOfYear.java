package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Optional;

public class MonthOfYear extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene(group, 300, 275);

        int month = readMonth();
        int year = readYear();

        if (month < 0 || year < 0){
            Platform.exit();
            return;
        } else if (year < 1900 || year > 2021){
            errorDialog();
        } else {
            showMonth(month, year);
            primaryStage.setTitle("Calendar");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

    private int readMonth(){
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Month prompt");
        inputDialog.setHeaderText(null);
        inputDialog.setContentText("Enter month:");

        Optional<String> userInputOptional = inputDialog.showAndWait();
        int month = -1  ;
        if (userInputOptional.isPresent()){
            month = Integer.parseInt(userInputOptional.get());
        }
        return month;
    }

    private int readYear(){
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Year prompt");
        inputDialog.setHeaderText(null);
        inputDialog.setContentText("Enter year: ");

        Optional<String> userInputOptional = inputDialog.showAndWait();
        int year = -1;
        if (userInputOptional.isPresent()){
            year = Integer.parseInt(userInputOptional.get());
        }
        return year;
    }

    private void errorDialog(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("The year should be between 1900 and 2021");
        alert.showAndWait();
    }

    private void showMonth(int month, int year){

        LocalDate date = LocalDate.now();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

    }
}
