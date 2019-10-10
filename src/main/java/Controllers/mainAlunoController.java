package Controllers;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import rojie.poo.ifsc.P1.App;
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
	    void MeusDados(ActionEvent event) throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("meusDados.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnMeusDados.getScene().getWindow();
			stage.close();
	    }

	    @FXML
	    void MinhasTarefas(ActionEvent event) {

	    }

	    @FXML
	    void MinhasTurmas(ActionEvent event) throws IOException {
	    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("listaAlunos.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage = (Stage) btnMinhasTurmas.getScene().getWindow();
			stage.close();
	}
	  

}
