module com.example.practicaparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicaparcial to javafx.fxml;
    exports com.example.practicaparcial;
}