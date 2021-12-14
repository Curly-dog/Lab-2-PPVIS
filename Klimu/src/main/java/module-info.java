module com.example.klimu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.klimu to javafx.fxml;
    exports com.example.klimu;
    exports com.example.klimu.view;
    opens com.example.klimu.view to javafx.fxml;
}