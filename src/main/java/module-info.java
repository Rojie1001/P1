module rojie.poo.ifsc.P1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens rojie.poo.ifsc.P1 to javafx.fxml;
    exports rojie.poo.ifsc.P1;
}