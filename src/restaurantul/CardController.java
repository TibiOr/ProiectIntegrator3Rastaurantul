package restaurantul;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CardController {
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label plateCard;

    @FXML
    private Label cash;

    @FXML
    private Label nota;

    @FXML
    void confirmare(ActionEvent event) {
    	nota.setVisible(true);
    }

    @FXML
    void renunta(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void initialize() {
    	cash.setVisible(true);
    }
}
