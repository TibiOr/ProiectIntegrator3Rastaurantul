package restaurantul;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

public class Masa1Controller {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button binchide;

	@FXML
	private Button numerar;

	@FXML
	private Button plateCard;

	@FXML
	private Button modifica;

	@FXML
	private Button trimiteComanda;

	@FXML
	private Button sterge;

	@FXML
	private Button adauga;
	@FXML
	private Label succes;

	@FXML
	private ListView<String> preparateDisponibile;

	@FXML
	private ListView<String> selectateSelectate;

	@FXML
	void adauga(ActionEvent event) {
		selectateSelectate.getItems().clear();
		// Preiau indicii elementelor selectate
		ObservableList<Integer> dispo = preparateDisponibile.getSelectionModel().getSelectedIndices();
		for (int pozitia : dispo) {
			String ecurent = preparateDisponibile.getItems().get(pozitia);
			// Adaug in lista din dreapta
			selectateSelectate.getItems().add(ecurent);
		}
	}

	@FXML
	void delogare(ActionEvent event) {
		Stage stage = (Stage) binchide.getScene().getWindow();
		stage.hide();
	}

	@FXML
	void modifica(ActionEvent event) {

	}

	@FXML
	void numerar(ActionEvent event) {

	}

	@FXML
	void plateCard(ActionEvent event) {

	}

	@FXML
	void sterge(ActionEvent event) {
		selectateSelectate.getItems().clear();
	}

	@FXML
	void trimiteComanda(ActionEvent event) {
		succes.setVisible(true);
	}

	@FXML
	void initialize() {
		preparateDisponibile.getItems().addAll("===Lapte===", "Faina", "Drojdie", "Unt");
		preparateDisponibile.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}
}
