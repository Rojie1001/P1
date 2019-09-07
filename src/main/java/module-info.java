module rojie.poo.ifsc.P1 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

    opens rojie.poo.ifsc.P1 to javafx.fxml;
    exports rojie.poo.ifsc.P1;
}