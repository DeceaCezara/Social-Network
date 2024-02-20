module com.example.laborator7gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.laborator7gui to javafx.fxml;
    exports com.example.laborator7gui;

    exports com.example.laborator7gui.Domain;
    opens com.example.laborator7gui.Domain to javafx.fxml;
    exports com.example.laborator7gui.Controller;
    opens com.example.laborator7gui.Controller to javafx.fxml;
    exports com.example.laborator7gui.Controller.alert;
    opens com.example.laborator7gui.Controller.alert to javafx.fxml;

}