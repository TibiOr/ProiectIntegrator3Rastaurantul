package restaurantul;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MeseController {

	Stage masa1Stage = new Stage();
	Masa1Controller ctrlInfo;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button main;

	@FXML
	void m1(MouseEvent event) {
		masa1Stage.showAndWait();
	}

	@FXML
	void m2(MouseEvent event) {

	}

	@FXML
	void m3(MouseEvent event) {

	}

	@FXML
	void m4(ContextMenuEvent event) {

	}

	@FXML
	void main(ActionEvent event) {

	}

	@FXML
	void initialize() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Masa1.fxml"));
			AnchorPane container = (AnchorPane) loader.load();
			ctrlInfo = loader.getController();
			masa1Stage.setTitle("Masa 1");
			masa1Stage.initModality(Modality.APPLICATION_MODAL);
			Scene scena = new Scene(container);
			masa1Stage.setScene(scena);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
