package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import database.AlunoDAO;
import database.ProfessorDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Aluno;
import model.Professor;
import rojie.poo.ifsc.P1.App;


public class CadastroController implements Initializable{

    
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

	public ObservableList<String> listCbox = FXCollections.observableArrayList("Aluno", "Professor");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cmbUserRegister.setItems(listCbox);
		
	}
    @FXML
    void Verificar(ActionEvent event) throws IOException {
    	if(cmbUserRegister.getValue().toString().equals("Aluno")) {
    		CadastroAluno(event);
    	}
    	else if(cmbUserRegister.getValue().toString().equals("Professor")) {
    		CadastroProfessor(event);
    	}
    }
    
	public void CadastroAluno(ActionEvent e) throws IOException {
		Aluno aluno = new Aluno(txtCpf.getText(), txtNome.getText(), txtCurso.getText(),
				txtNewLogin.getText(), txtNewSenha.getText());
		System.out.println(txtCpf.getText());
		new AlunoDAO().add(aluno);
		Button btn = (Button) e.getSource();
		Scene scene = btn.getScene();
		Stage stage = (Stage) scene.getWindow();
		txtCpf.setText(null);
		txtNome.setText(null);
		txtCurso.setText(null);
		txtNewLogin.setText(null);
		txtNewSenha.setText(null);
		
	}
	public void CadastroProfessor(ActionEvent e) throws IOException {
		Professor professor = new Professor(txtCpf.getText(), txtNome.getText(), txtCurso.getText(),
				txtNewLogin.getText(), txtNewSenha.getText());
		System.out.println(txtCpf.getText());
		new ProfessorDAO().add(professor);
		Button btn = (Button) e.getSource();
		Scene scene = btn.getScene();
		Stage stage = (Stage) scene.getWindow();
		txtCpf.setText(null);
		txtNome.setText(null);
		txtCurso.setText(null);
		txtNewLogin.setText(null);
		txtNewSenha.setText(null);
	}
	public void Cancelar(ActionEvent e) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCancelarr.getScene().getWindow();
		stage.close();
	}
	
}