package rojie.poo.ifsc.P1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginSuperUser {
	
    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnLoginn;

    public void fazerCadastro() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("cadastro.fxml"));
		Parent root = (Parent) fxmlLoader.load();

		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnLoginn.getScene().getWindow();
		stage.close();
	}

	}

