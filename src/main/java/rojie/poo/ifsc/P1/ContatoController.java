package rojie.poo.ifsc.P1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ContatoController implements Initializable {

	@FXML
	private ChoiceBox<String> choicebox1 = new ChoiceBox<>();
	@FXML
	private Label lblInfo;

	@FXML
	private ChoiceBox<String> choicebox2 = new ChoiceBox<>();

	@FXML
	private CheckBox chkAgradecimento;

	@FXML
	private CheckBox chkElogio;

	@FXML
	private CheckBox chkReclamacao;

	@FXML
	private CheckBox chkSugestao;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		choicebox1.getItems().add("Acadêmico");
		choicebox1.getItems().add("Administrativo");

		choicebox2.getItems().add("Infraestrutura");
		choicebox2.getItems().add("Cursos");
		choicebox2.getItems().add("Servidores");
		choicebox2.getItems().add("Limpeza");

	}

}
