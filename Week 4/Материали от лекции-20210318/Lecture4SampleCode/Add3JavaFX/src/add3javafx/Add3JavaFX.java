/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add3javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author echrk
 */
public class Add3JavaFX extends Application {  
    @Override
    public void start(Stage stage) throws Exception {
        // Прочита дървовидната структура на Сцената
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        // Създава обект от Сцената, инициализира обектите в Сцената
        Scene scene = new Scene(root);
        
        stage.setTitle("Add 3 numbers");// Задава заглавие на Постановката
        stage.setScene(scene);          // Зарежда Сцената в Постановката
        stage.show();              // Показва Сцената в графичния прозорец
    }
    /**
     * Начална точка за изпълнение на JavaFX приложение
     */
    public static void main(String[] args) {
        launch(args);
    }    
}
