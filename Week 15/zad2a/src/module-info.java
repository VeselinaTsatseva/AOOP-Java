module zad2a {
    requires javafx.fxml;
    requires javafx.controls;

    opens sample to javafx.fxml;
    exports sample to javafx.graphics;
}