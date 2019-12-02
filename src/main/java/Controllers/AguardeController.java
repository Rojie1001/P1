package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Threads.ConexaoServer;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import model.Curso;
import model.InterfaceTherad;
import rojie.poo.ifsc.P1.App;

public class AguardeController implements Initializable {

	@FXML
	ProgressBar barra;
	@FXML
	Button btncancelar;

	private String proxTela;
	private String status = "rodando";

	public void setProxTela(String proxTela) {
		this.proxTela = proxTela;
	}

	private Thread threadConexao;
	private Thread threadBarra;
	private ConexaoServer clienteThread;
	private String menssagem;

	public class ThreadBarra implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			double progesso = 0;
			while (threadConexao.isAlive()) {
				barra.setProgress(progesso);
				progesso += 0.05;
				if (barra.getProgress() >= 1.0) {
					progesso = 0;
				}
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					while (clienteThread.getMenssagem().equals(menssagem));

					

		

					try {
						if(status.equals("rodando")) {
						carregarTela();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}

	}

	public class ThreadVerificadora implements Runnable {

		@Override
		public void run() {

			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					while (clienteThread.getMenssagem().equals(menssagem));

					

					try {
						carregarTela();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});

		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}

	public void conectar(String menssagemFora) {

		menssagem = menssagemFora;
		clienteThread = new ConexaoServer(menssagem);
		threadConexao = new Thread(clienteThread);
		threadConexao.start();
		ThreadBarra barraThread = new ThreadBarra();
		threadBarra = new Thread(barraThread);
		threadBarra.start();
		ThreadVerificadora verificadora = new ThreadVerificadora();
		Thread verificadoraThread = new Thread(verificadora);

	}

	public void carregarTela() throws IOException {
		threadBarra.stop();
		threadConexao.stop();
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(proxTela + ".fxml"));
		Parent root = (Parent) fxmlLoader.load();
		InterfaceTherad controller = (InterfaceTherad) fxmlLoader.getController();
		controller.setResposta(clienteThread.getMenssagem());
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btncancelar.getScene().getWindow();
		stage.close();
	}
	
	@FXML
	void Cancelar(ActionEvent event) throws IOException {
		
		this.status="encerrado";
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.show();
		stage = (Stage) btncancelar.getScene().getWindow();
		stage.close();

	}

}
