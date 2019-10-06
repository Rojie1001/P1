package rojie.poo.ifsc.P1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Aluno;


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
    
    private String aluno = "Aluno";
    private String curso = "Curso";
    private String professor = "Professor";
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		 cmbBD.getItems().add(curso);
		 cmbBD.getItems().add(professor);
		 cmbBD.getItems().add(aluno);
		
	}
   
    
	public void Cadastro() throws IOException {
		
	}
	public void Cancelar() throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("loginAluno.fxml"));
		Parent root = (Parent) fxmlLoader.load();

		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCancelarr.getScene().getWindow();
		stage.close();
	}
}