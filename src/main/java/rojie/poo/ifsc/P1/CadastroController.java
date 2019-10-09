package rojie.poo.ifsc.P1;

import java.io.IOException;
import database.AlunoDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Aluno;


public class CadastroController {

    
	   @FXML
	    private ComboBox<String> cmbUserRegister;

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

	public static ObservableList<String> listCbox;
	
    
	public void Cadastro(ActionEvent e) throws IOException {
		Aluno aluno = new Aluno(txtCpf.getText(), txtNome.getText(), txtCurso.getText(),
				txtNewLogin.getText(), txtNewSenha.getText());
		System.out.println(txtCpf.getText());
		new AlunoDAO().add(aluno);
		Button btn = (Button) e.getSource();
		Scene scene = btn.getScene();
		Stage stage = (Stage) scene.getWindow();
		
	}
	public void Cancelar(ActionEvent e) throws IOException {
		Button btn = (Button) e.getSource();
		Scene scene = btn.getScene();
		Stage stage = (Stage) scene.getWindow();
		stage.close();
	}
	
}