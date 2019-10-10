package Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import rojie.poo.ifsc.P1.App;

public class ControllerLoginProfessor {
    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnSuperUser;

	
	public void SuperUser() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("loginSuperuser.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("LoginSuperUser");
		stage.show();
		stage = (Stage) btnSuperUser.getScene().getWindow();
		stage.close();
	}
}
