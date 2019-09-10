package rojie.poo.ifsc.P1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class AtestadoController implements Initializable {

    @FXML
    private ImageView imglogo;
    
    @FXML
    private ImageView imgDtic;

    @FXML
    private TableColumn<Atestado, String> colCod;

    @FXML
    private TableColumn<Atestado, String> colComp;

    @FXML
    private TableColumn<Atestado, String> colTurma;

    @FXML
    private TableColumn<Atestado, String> colStatus;

    @FXML
    private TableColumn<Atestado, String> colHorario;
    
    @FXML
    private TableView<Atestado> tblAtestado;

   
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("teste");
		
		colCod.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
		colComp.setCellValueFactory(new PropertyValueFactory<>("Comp"));
		colTurma.setCellValueFactory(new PropertyValueFactory<>("Turma"));
		colStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
		colHorario.setCellValueFactory(new PropertyValueFactory<>("Horario"));

		tblAtestado.setItems(listaAtestado());
		
	}
	
	private ObservableList<Atestado> listaAtestado() {
		return FXCollections.observableArrayList(new Atestado("EAG164104", "ADMINISTRAÇÃO GERAL", "01", "MATRICULADO" , "56N12 "),
				new Atestado("EGP164104", "GERÊNCIA DE PROJETOS", "01","MATRICULADO","6N34"),
				new Atestado("EMP164104", "METODOLOGIA DA PESQUISA", "01","MATRICULADO","4N34"),
				new Atestado("EPO164104", "PROGRAMAÇÃO ORIENTADA A OBJETOS II", "01","MATRICULADO","34N12 "),
				new Atestado("EGP164104", "PROGRAMAÇÃO PARA INTERNET I", "01","MATRICULADO","2N12 3N34 "),
				new Atestado("ESO164104", "SISTEMAS OPERACIONAIS", "01","MATRICULADO","25N34"));
	}

}
