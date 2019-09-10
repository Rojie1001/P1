package rojie.poo.ifsc.P1;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ManifestacoesController {


    @FXML
    private TextArea txtRecebe;
 
    
    public void recebendo(String recebe) {
    	txtRecebe.setText(recebe);
    }
}
