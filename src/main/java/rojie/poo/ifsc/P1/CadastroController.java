package rojie.poo.ifsc.P1;

import java.io.IOException;
import javafx.fxml.FXML;

public class CadastroController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}