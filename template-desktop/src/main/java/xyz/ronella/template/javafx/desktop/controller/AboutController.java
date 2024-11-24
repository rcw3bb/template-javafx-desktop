package xyz.ronella.template.javafx.desktop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * The controller related to About UI.
 *
 * @since 1.0.0
 * @author Ron Webb
 */
@SuppressWarnings("PMD.UnusedPrivateMethod")
public class AboutController implements Initializable {

    @FXML
    private Button btnClose;

    @FXML
    private void btnCloseAction(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
