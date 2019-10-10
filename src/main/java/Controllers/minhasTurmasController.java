package Controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import rojie.poo.ifsc.P1.App;

public class minhasTurmasController {
	
	
	 @FXML
	 private Button btnVoltar;
	 
	 @FXML
	 public void Voltar() throws IOException {
		 FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("mainAluno.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnVoltar.getScene().getWindow();
			stage.close();
	 }
	 

}
