package controllers;

import gui.util.Alerts;
import gui.util.Constrains;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    public void onBtSumAction() {
        Locale.setDefault(Locale.US);
        double number1 = Double.parseDouble(txtNumber1.getText());
        double number2 = Double.parseDouble(txtNumber2.getText());
        double sum = number1 + number2;

        labelResult.setText(String.format("%.2f", sum));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constrains.setTextFieldDouble(txtNumber1);
        Constrains.setTextFieldDouble(txtNumber2);
        Constrains.setTextFieldMaxLength(txtNumber1,12);
        Constrains.setTextFieldMaxLength(txtNumber2,12);
    }
}
