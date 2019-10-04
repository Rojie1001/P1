package rojie.poo.ifsc.P1;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginUserController {

	  @FXML
	    private TextField txtLogin;

	    @FXML
	    private TextField txtSenha;

	    @FXML
	    private Button btnLogin;

	    @FXML
	    private Button btnSuperUser;



	public void SuperUser() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnSuperUser.getScene().getWindow();
		stage.close();
	}

	public void Entrar() throws IOException {
			FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("telaone.fxml"));
			Parent root = (Parent) fxmlLoader.load();

			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnLogin.getScene().getWindow();
			stage.close();
		}

	}

