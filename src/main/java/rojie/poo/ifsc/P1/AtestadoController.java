package rojie.poo.ifsc.P1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class AtestadoController {

    @FXML
    private ImageView imglogo;
    
    @FXML
    private ImageView imgDtic;

    @FXML
    private TableColumn<AtestadoMatricula, String> colCod;

    @FXML
    private TableColumn<AtestadoMatricula, String> colComp;

    @FXML
    private TableColumn<AtestadoMatricula, String> colTurma;

    @FXML
    private TableColumn<AtestadoMatricula, String> colStatus;

    @FXML
    private TableColumn<AtestadoMatricula, String> colHorario;
    
    @FXML
    private TableView<AtestadoMatricula> tblAtestado;

   
	@FXML
	public void initialize() {		
		
		colCod.setCellValueFactory(new PropertyValueFactory("Codigo"));
		colComp.setCellValueFactory(new PropertyValueFactory("Comp"));
		colTurma.setCellValueFactory(new PropertyValueFactory("Turma"));
		colStatus.setCellValueFactory(new PropertyValueFactory("Status"));
		colHorario.setCellValueFactory(new PropertyValueFactory("Horario"));

		tblAtestado.setItems(listaAtestado());
		
	}
	
	private ObservableList<AtestadoMatricula> listaAtestado() {
		return FXCollections.observableArrayList(new AtestadoMatricula("EAG164104", "ADMINISTRAÇÃO GERAL", "01", "MATRICULADO" , "56N12 "),
				new AtestadoMatricula("EGP164104", "GERÊNCIA DE PROJETOS", "01","MATRICULADO","6N34"),
				new AtestadoMatricula("EMP164104", "METODOLOGIA DA PESQUISA", "01","MATRICULADO","4N34"),
				new AtestadoMatricula("EPO164104", "PROGRAMAÇÃO ORIENTADA A OBJETOS II", "01","MATRICULADO","34N12 "),
				new AtestadoMatricula("EGP164104", "PROGRAMAÇÃO PARA INTERNET I", "01","MATRICULADO","2N12 3N34 "),
				new AtestadoMatricula("ESO164104", "SISTEMAS OPERACIONAIS", "01","MATRICULADO","25N34"));
	
		
	}

}
