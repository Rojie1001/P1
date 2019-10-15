package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import database.AlunoDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.Aluno;

public class ControllerChamada implements Initializable {
    @FXML
    private ListView<Aluno> listChamada;

    @FXML
    private Button btnVoltar;

    @FXML
    void Voltar(ActionEvent event) {

    }
    public void updateListAluno() {
 		AlunoDAO dao = new AlunoDAO();
 		listChamada.setItems(null);
 		listChamada.setItems((ObservableList<Aluno>) dao.getAll());

 		
 	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		updateListAluno();
		
	}

}
