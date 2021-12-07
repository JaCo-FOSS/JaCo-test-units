module com.example.jaco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jaco to javafx.fxml;
    exports com.example.jaco;
}