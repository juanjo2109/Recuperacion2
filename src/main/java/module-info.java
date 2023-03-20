module com.example.recuperacion2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recuperacion2 to javafx.fxml;
    exports com.example.recuperacion2;
}