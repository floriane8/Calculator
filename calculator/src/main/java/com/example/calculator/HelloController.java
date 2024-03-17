package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button addition;

    @FXML
    private Button division;

    @FXML
    private Button expo;

    @FXML
    private Button modulo;

    @FXML
    private Button multipli;

    @FXML
    private TextField nbr1;

    @FXML
    private TextField nbr2;

    @FXML
    private TextField result;

    @FXML
    private Button substaction;

    Calcul calcul=new Calcul();

    @FXML
    void add(ActionEvent event) {
        double n=Double.parseDouble(nbr1.getText());
        double m=Double.parseDouble(nbr2.getText());
        double sol= calcul.addFunk(n,m);
        result.setText(String.valueOf(sol));
    }

    @FXML
    void divide(ActionEvent event) {
        double sol= calcul.divFunk(Double.parseDouble(nbr1.getText()),Double.valueOf(nbr2.getText()));
        result.setText(String.valueOf(sol));

    }

    @FXML
    void exp(ActionEvent event) {
        double sol= calcul.expFunk(Double.valueOf(nbr1.getText()),Double.valueOf(nbr2.getText()));
        result.setText(String.valueOf(sol));

    }

    @FXML
    void mod(ActionEvent event) {
        double sol= calcul.modFunk(Double.valueOf(nbr1.getText()),Double.valueOf(nbr2.getText()));
        result.setText(String.valueOf(sol));
    }

    @FXML
    void mul(ActionEvent event) {
        double sol= calcul.mulFunk(Double.valueOf(nbr1.getText()),Double.valueOf(nbr2.getText()));
        result.setText(String.valueOf(sol));
    }

    @FXML
    void sub(ActionEvent event) {
        double sol= calcul.subFunk(Double.valueOf(nbr1.getText()),Double.valueOf(nbr2.getText()));
        result.setText(String.valueOf(sol));
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}