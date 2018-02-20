package restaurantul;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginController {

	private String codAcces = "";

	Stage meseStage = new Stage();
	MeseController ctrlInfo;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button unu;

	@FXML
	private Button noua;

	@FXML
	private Button sase;

	@FXML
	private Button opt;

	@FXML
	private Button cinci;

	@FXML
	private Button patru;

	@FXML
	private Button sapte;

	@FXML
	private Button trei;

	@FXML
	private Button doi;

	@FXML
	private Button zero;

	@FXML
	private Button ies;

	@FXML
	private Label mesajEroare;

	@FXML
	void cinci(ActionEvent event) {
		codAcces += '5';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void doi(ActionEvent event) {
		codAcces += '2';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void ies(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	void noua(ActionEvent event) {
		codAcces += '9';
		if (codAcces.length() == 4) {
			verific();
		}

	}

	@FXML
	void opt(ActionEvent event) {
		codAcces += '8';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void patru(ActionEvent event) {
		codAcces += '4';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void sapte(ActionEvent event) {
		codAcces += '7';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void sase(ActionEvent event) {
		codAcces += '6';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void trei(ActionEvent event) {
		codAcces += '3';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void unu(ActionEvent event) {
		codAcces += '1';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	@FXML
	void zero(ActionEvent event) {
		codAcces += '0';
		if (codAcces.length() == 4) {
			verific();
		}
	}

	void verific() {
		if (codAcces.equals("7777")) {
			// Codul e bun. Incarc interfata care afiseaza mesele
			meseStage.showAndWait();

		} else {
			mesajEroare.setVisible(true);
			codAcces = "";
		}
	}

	@FXML
	void initialize() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Mese.fxml"));
			AnchorPane container = (AnchorPane) loader.load();
			ctrlInfo = loader.getController();
			meseStage.setTitle("Mese");
			meseStage.initModality(Modality.APPLICATION_MODAL);
			Scene scena = new Scene(container);
			meseStage.setScene(scena);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
