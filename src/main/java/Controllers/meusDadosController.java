package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class meusDadosController {

	@FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> colCpf;

    @FXML
    private TableColumn<?, ?> colNome;

    @FXML
    private TableColumn<?, ?> colCurso;

    @FXML
    private TableColumn<?, ?> colLogin;

    @FXML
    private TableColumn<?, ?> colSenha;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCurso;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnEnviar;

    @FXML
    void Enviar(ActionEvent event) {

    }
}
