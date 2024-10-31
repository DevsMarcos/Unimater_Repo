module com.example.aps2_contador_invetario_2024 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens dva to javafx.fxml;
    exports dva;
}