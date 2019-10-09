package rojie.poo.ifsc.P1;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class mainAlunoController {

	    @FXML
	    private Button btnMinhasTurmas;

	    @FXML
	    private Button btnAMatricula;

	    @FXML
	    private Button btnMinhasTarefas;

	    @FXML
	    private Button btnMeusDados;

	    @FXML
	    void Atestado() throws IOException {
	   	 FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("atestado.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnAMatricula.getScene().getWindow();
			stage.close();
	    }

	    @FXML
	    void MeusDados(ActionEvent event) {

	    }

	    @FXML
	    void MinhasTarefas(ActionEvent event) {

	    }

	    @FXML
	    void MinhasTurmas(ActionEvent event) throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("minhasTurmas.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnMinhasTurmas.getScene().getWindow();
			stage.close();
	}
	  

}
