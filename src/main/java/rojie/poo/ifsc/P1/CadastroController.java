package rojie.poo.ifsc.P1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CadastroController {

    
    @FXML
    Button btnCadastrar;
	public void Cadastro() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
		Parent root = (Parent) fxmlLoader.load();
	
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCadastrar.getScene().getWindow();
		stage.close();
	}
}