package rojie.poo.ifsc.P1;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Professor;

public class CadastroController {

    
    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtPass;

    @FXML
    private TextField txtPassConfirm;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnCancelar;


	    
	    
	  
	public void Cadastro() throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
		Parent root = (Parent) fxmlLoader.load();
	
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btnCadastrar.getScene().getWindow();
		stage.close();
		
		if(txtCpf.getText().equals(null) || txtNome.getText().equals(null) 
			|| txtLogin.getText().equals(null) || txtPass.getText().equals(null)) {
			
			String[] opcoes = {"Fechar", "Sair"};
			JOptionPane.showOptionDialog(null, "TEXTO", "TITULO!", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
		}
		
		
	
}
	
	

}