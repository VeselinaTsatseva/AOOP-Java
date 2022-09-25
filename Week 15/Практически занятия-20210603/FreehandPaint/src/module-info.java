module FreehandPaint {
    requires javafx.fxml;
    requires javafx.controls;
    opens painter to javafx.fxml;
    exports painter to javafx.graphics;
}