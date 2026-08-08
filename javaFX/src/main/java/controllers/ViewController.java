package controllers;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        System.out.println("Click");
        Alerts.showAlerts("Alert Title", "Alert Header", "Hello", Alert.AlertType.INFORMATION);
    }

}
