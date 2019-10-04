package rojie.poo.ifsc.P1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;


public class CadastroController implements Initializable {

    
	@FXML
    private ChoiceBox<String>cmbBD = new ChoiceBox<>();

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtCurso;

    @FXML
    private TextField txtNewLogin;

    @FXML
    private TextField txtNewSenha;

    @FXML
    private Button btnCadastro;

    @FXML
    private Button btnCancelarr;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		 cmbBD.getItems().add("Curso");
		 cmbBD.getItems().add("Professor");
		 cmbBD.getItems().add("Aluno");
		
	}
   
    
	public void Cadastro() throws IOException {
		

	}
}