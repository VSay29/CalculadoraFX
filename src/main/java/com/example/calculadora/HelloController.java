package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btnGo;
    @FXML
    private ComboBox<String> cmbBoxOperation;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField txtResult;

    @FXML
    public void initialize() {
        cmbBoxOperation.getItems().addAll("+", "-", "*", "/");
    }

    @FXML
    public void calcular(ActionEvent actionEvent) {
        double num1 = 0.0, num2 = 0.0;
        if(!txtNum1.getText().isEmpty()) num1 = Double.parseDouble(txtNum1.getText());
        if(!txtNum2.getText().isEmpty()) num2 = Double.parseDouble(txtNum2.getText());
        if(cmbBoxOperation.getValue().equals("+")) txtResult.setText(String.valueOf(num1 + num2));
        if(cmbBoxOperation.getValue().equals("-")) txtResult.setText(String.valueOf(num1 - num2));
        if(cmbBoxOperation.getValue().equals("*")) txtResult.setText(String.valueOf(num1 * num2));
        if(cmbBoxOperation.getValue().equals("/")) txtResult.setText(String.valueOf(num1 / num2));
    }
}
