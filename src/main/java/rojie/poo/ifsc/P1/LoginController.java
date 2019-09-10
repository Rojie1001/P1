package rojie.poo.ifsc.P1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	Label lblEntraSis;

	@FXML
	Label lblUser;

	@FXML
	Label lblPass;

	@FXML
	TextField txtGetUser;

	@FXML
	TextField txtGetPass;

	@FXML
	Button btnEntrar;

	@FXML
	Button btnCadastro;



	public void Cadastrar() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("cadastro.fxml"));
		Parent root = (Parent) fxmlLoader.load();

		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCadastro.getScene().getWindow();
		stage.close();
	}

	public void Entrar() throws IOException {
			FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("telaone.fxml"));
			Parent root = (Parent) fxmlLoader.load();

			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnEntrar.getScene().getWindow();
			stage.close();
		}

	}

