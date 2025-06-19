module com.ydova.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ydova.calculator to javafx.fxml;
    exports com.ydova.calculator;
}