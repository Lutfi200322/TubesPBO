module com.example.alalalala {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alalalala to javafx.fxml;
    exports com.example.alalalala;
}