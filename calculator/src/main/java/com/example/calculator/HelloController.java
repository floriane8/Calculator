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

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void divide(ActionEvent event) {

    }

    @FXML
    void exp(ActionEvent event) {

    }

    @FXML
    void mod(ActionEvent event) {

    }

    @FXML
    void mul(ActionEvent event) {

    }

    @FXML
    void sub(ActionEvent event) {

    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}