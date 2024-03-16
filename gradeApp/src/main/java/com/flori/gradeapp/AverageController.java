package com.flori.gradeapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public  class AverageController implements  Initializable {
    ObservableList<MatiereDto> matiereList = FXCollections.observableList(new ArrayList<>());

    @FXML
    private Button addSubject;

    @FXML
    private TextField calculAverage;

    @FXML
    private TextField coefficient;

    @FXML
    private Button delateSubject;

    @FXML
    private TextField name;


    @FXML
    private TextField note;

    @FXML
    private TableView<MatiereDto> table;
    @FXML
    private TableColumn<MatiereDto, String> nameColumn;
    @FXML
    private TableColumn<MatiereDto, String> noteColumn;
    @FXML
    private TableColumn<MatiereDto, String> coefColumn;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //connecter les colones du tableau et la liste de matiere
        table.setEditable(false);

        //creating of cologne
        nameColumn.setCellValueFactory(param -> param.getValue().nameProperty());
        coefColumn.setCellValueFactory(param -> param.getValue().coeffProperty());
        noteColumn.setCellValueFactory(param -> param.getValue().noteProperty());

        table.setItems(matiereList);
    }


    @FXML
    void add(ActionEvent event) {
       matiereList.add(new MatiereDto( name.getText(),coefficient.getText(),note.getText()));
       name.clear();
       coefficient.clear();
       note.clear();
    }
    @FXML
    void calcul(ActionEvent event) {


    }

    @FXML
    void delate(ActionEvent event) {
        name.clear();
        note.clear();
        coefficient.clear();

    }




}