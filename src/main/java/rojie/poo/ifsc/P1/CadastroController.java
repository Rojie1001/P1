package rojie.poo.ifsc.P1;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroController {

    
	   @FXML
	    private TextField txtMatricula;

	    @FXML
	    private TextField txtNome;

	    @FXML
	    private TextField txtLogin;

	    @FXML
	    private TextField txtPass;

	    @FXML
	    private Button btnCadastrar;

	  
	public void Cadastro() throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
		Parent root = (Parent) fxmlLoader.load();
	
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCadastrar.getScene().getWindow();
		stage.close();
	}
	public void loginC() {
		ObservableList<TextField> listLogin = FXCollections.observableArrayList(txtLogin);
		ObservableList<TextField> listSenha = FXCollections.observableArrayList(txtPass);
		ObservableList<TextField> listNome= FXCollections.observableArrayList(txtNome);
		
		
	}
	

}