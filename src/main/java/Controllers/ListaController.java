package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import database.AlunoDAO;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.Aluno;
import model.Professor;
import rojie.poo.ifsc.P1.App;


public class ListaController implements Initializable {
	
	@FXML
    private ListView<Professor> listProfessor;

    @FXML
    private ListView<Aluno> listAluno;

    @FXML
    private Button btnApagar;

    @FXML
    private Button btnAtualizar;

    @FXML
    private Button btnSair;
    
 
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	updateList();
		
	}
    public void updateList() {
 		AlunoDAO dao = new AlunoDAO();
 		listAluno.setItems(null);
 		listAluno.setItems((ObservableList<Aluno>) dao.getAll());
 		
 	}
     

    @FXML
    void Apagar(ActionEvent event) {
    	new AlunoDAO().delete((Aluno) listAluno.getSelectionModel().getSelectedItem());
    }

    @FXML
    void Atualizar(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("update.fxml"));
		Parent parent = fxmlLoader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

		UpdateController controller = (UpdateController) fxmlLoader.getController();
		controller.selectedAluno(listAluno.getSelectionModel().getSelectedItem(), this);
	}
    

    @FXML
    void Sair(ActionEvent event) {
    	Platform.exit();
    }

	
	

}
