package com.flori.gradeapp;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class table extends AverageController {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("meine Datei");

        //creating of table
        TableView<MatiereDto> tableView = new TableView<>();
        tableView.setEditable(true);

        //creating of cologne
        TableColumn<MatiereDto, String> namecol = new TableColumn<>("name");
        namecol.setCellValueFactory(param -> param.getValue().nameProperty());

        TableColumn<MatiereDto, String> coeffcol = new TableColumn<>("coeff");
        coeffcol.setCellValueFactory(param -> param.getValue().coeffProperty());

        TableColumn<MatiereDto, String> notecol = new TableColumn<>("note");
        notecol.setCellValueFactory(param -> param.getValue().noteProperty());

        //add a column in the table
        tableView.getColumns().addAll(namecol, coeffcol, notecol);

        //create the form and add the data

        TextField nameField = new TextField();
        TextField coeffField = new TextField();
        TextField noteField = new TextField();
        Button addButton = new Button("addRow");
        addButton.setOnAction(event -> {
            String name = nameField.getText();
            String coefficient = coeffField.getText();
            String note = noteField.getText();
            tableView.getItems().add(new MatiereDto(name, coefficient, note));
            nameField.clear();
            noteField.clear();
            coeffField.clear();
        });

        //creation de la mise en page
        VBox vBox = new VBox();
        vBox.getChildren().addAll(tableView, nameField, coeffField, noteField, addButton);

        //scene Display

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
