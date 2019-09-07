package rojie.poo.ifsc.P1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

public class ContatoController implements Initializable {

	@FXML
	private ChoiceBox<String> choicebox1 =  new ChoiceBox<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		choicebox1.getItems().add("teste");
		choicebox1.getItems().add("teste 2");
		
	}


}
