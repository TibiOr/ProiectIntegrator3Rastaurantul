package restaurantul;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Masa1Controller {

	Stage numerarStage = new Stage();
	NumerarController ctrlInfo;
	
	Stage cardStage = new Stage();
	CardController ctrlCard;

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
	private Button bauturi;

	@FXML
	private Button felPrincipal;

	@FXML
	private Button ciorbe;

	@FXML
	private Button desert;

	@FXML
	private ListView<String> preparateDisponibile;

	@FXML
	private ListView<String> selectateSelectate;

	@FXML
	private Label succes;

	@FXML
	void adauga(ActionEvent event) {
		// selectateSelectate.getItems().clear();
		// Preiau indicii elementelor selectate
		ObservableList<Integer> dispo = preparateDisponibile.getSelectionModel().getSelectedIndices();
		for (int pozitia : dispo) {
			String ecurent = preparateDisponibile.getItems().get(pozitia);
			// Adaug in lista din dreapta
			selectateSelectate.getItems().add(ecurent);
		}
	}

	@FXML
	void bauturi(ActionEvent event) {
		preparateDisponibile.getItems().clear();
		preparateDisponibile.getItems().addAll("===Bauturile noastre===", "Paulaner", "Nenea Iancu", "Jack Daniels",
				"Henessy");
		preparateDisponibile.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	@FXML
	void ciorbe(ActionEvent event) {
		preparateDisponibile.getItems().clear();
		preparateDisponibile.getItems().addAll("===Ciorbele noastre===", "Ciorba de burta", "Visine", "Perisoare");
		preparateDisponibile.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	@FXML
	void delogare(ActionEvent event) {
		Stage stage = (Stage) binchide.getScene().getWindow();
		stage.hide();

	}

	@FXML
	void desert(ActionEvent event) {
		preparateDisponibile.getItems().clear();
		preparateDisponibile.getItems().addAll("===Deserturile noastre===", "Cheesecake", "Lava Cake", "Clatite",
				"Papanasi");
		preparateDisponibile.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}

	@FXML
	void felPrincipal(ActionEvent event) {
		preparateDisponibile.getItems().clear();
		preparateDisponibile.getItems().addAll("===Felurile noastre principale===", "Stake", "Friptura de porc",
				"Piept de pui");
		preparateDisponibile.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	@FXML
	void modifica(ActionEvent event) {

	}

	@FXML
	void numerar(ActionEvent event) {
		numerarStage.showAndWait();
	}

	@FXML
	void plateCard(ActionEvent event) {
		cardStage.showAndWait();

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
		preparateDisponibile.getItems().addAll("===Bauturile noastre===", "Paulaner", "Nenea Iancu", "Jack Daniels",
				"Henessy");
		preparateDisponibile.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Numerar.fxml"));
			AnchorPane container = (AnchorPane) loader.load();
			ctrlInfo = loader.getController();
			numerarStage.setTitle("Numerar");
			numerarStage.initModality(Modality.APPLICATION_MODAL);
			Scene scena = new Scene(container);
			numerarStage.setScene(scena);
		} catch (IOException e) {
			e.printStackTrace();

		}
	
	
	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Card.fxml"));
		AnchorPane container = (AnchorPane) loader.load();
		ctrlCard = loader.getController();
		cardStage.setTitle("Card");
		cardStage.initModality(Modality.APPLICATION_MODAL);
		Scene scena = new Scene(container);
		cardStage.setScene(scena);
	} catch (IOException e) {
		e.printStackTrace();

	}
}
}