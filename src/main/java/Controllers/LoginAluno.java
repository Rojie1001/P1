package Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import rojie.poo.ifsc.P1.App;

public class LoginAluno {

	 @FXML
	    private TextField txtLogin;

	    @FXML
	    private TextField txtSenha;

	    @FXML
	    private Button btnLogin;

	    @FXML
	    private Button btnCadastro;

	    @FXML
	    private ComboBox<String> cmbSelectDB;

	    @FXML
	   public void Cadastro() throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("cadastro.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnCadastro.getScene().getWindow();
			stage.close();
	    }

	    @FXML
	   public void Entrar() throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("mainAluno.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnLogin.getScene().getWindow();
			stage.close();
	    }

	    @FXML
	    public void SelectDB(ActionEvent event) {
	    	
	    }

	}

