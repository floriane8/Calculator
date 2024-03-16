package com.flori.gradeapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public abstract class AverageController {


    @FXML
    private Button addSubject;


    @FXML
    private TextField calculAverage;


    @FXML
    private TableColumn<MatiereDto, Integer> coeffTable;

    @FXML
    private TextField coefficient;

    @FXML
    private Button delateSubject;

    @FXML
    private TextField name;

    @FXML
    private TableColumn<MatiereDto, String> nameTable;

    @FXML
    private TextField note;

    @FXML
    private TableColumn<MatiereDto, Double> noteTable;

    @FXML
    private TableView<MatiereDto> tableUser;

    @FXML
    void add(ActionEvent event) {

    }
    @FXML
    void calcul(ActionEvent event) {


    }

    @FXML
    void delate(ActionEvent event) {

    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public abstract void start(Stage primaryStage);
}