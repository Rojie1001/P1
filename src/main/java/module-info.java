module rojie.poo.ifsc.P1 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens rojie.poo.ifsc.P1 to javafx.fxml;
    exports rojie.poo.ifsc.P1;
}