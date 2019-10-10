package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import database.AlunoDAO;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import model.Aluno;
import rojie.poo.ifsc.P1.App;
import javafx.scene.Node;

public class listAlunosController implements Initializable {
	@FXML
	private SplitPane splitPane;

	@FXML
	private ListView<Aluno> listAluno;

	private boolean barBottom = true;

	public void updateList() {
		AlunoDAO dao = new AlunoDAO();
		listAluno.setItems(null);
		listAluno.setItems((ObservableList<Aluno>) dao.getAll());
	}

	// método que será executado sempre que a interface gráfica terminar de ser
	// carregada
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		updateList();
	}

	@FXML
	private void register() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("register.fxml"));
		Parent parent = fxmlLoader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void changeBar() {

		// pegar a referência pro segundo item do split pane
		Node bottom = splitPane.getItems().get(1);
		// remover segundo item
		splitPane.getItems().remove(1);
		// colocar o segundo item na posição do primeiro
		splitPane.getItems().add(0, bottom);
		barBottom = !barBottom;
		if (barBottom)
			splitPane.setDividerPositions(0.8);
		else
			splitPane.setDividerPositions(0.2);
	}

	@FXML
	private void update() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("update.fxml"));
		Parent parent = fxmlLoader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

		// passo para o controlador da tela de update a referência do usuário
		// selecionado e deste controlador, para que depois ele possa pedir para
		// atualizar a listView
		UpdateController controller = (UpdateController) fxmlLoader.getController();
		controller.selectedAluno(listAluno.getSelectionModel().getSelectedItem(), this);
	}

	@FXML
	private void delete() {
		new AlunoDAO().delete(listAluno.getSelectionModel().getSelectedItem());
	}

	@FXML
	private void exit() {
		Platform.exit();
	}
}
