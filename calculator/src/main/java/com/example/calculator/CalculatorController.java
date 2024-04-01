package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    private double number1;
    private double nummer2;
    private String operator;

    @FXML
    private Button closeParenthese;
    @FXML
    private Button comma;
    @FXML
    private Button eight;
    @FXML
    private Button five;
    @FXML
    private Button four;
    @FXML
    private Button nine;
    @FXML
    private Button one;
    @FXML
    private Button openParenthe;
    @FXML
    private Button seven;
    @FXML
    private Button six;
    @FXML
    private Button three;
    @FXML
    private Button two;
    @FXML
    private Button zero;
    @FXML
    private Button addition;
    @FXML
    private Button division;
    @FXML
    private Button e;
    @FXML
    private Button modulo;
    @FXML
    private Button multipli;
    @FXML
    private TextField results;
    @FXML
    private Button substaction;
    @FXML
    private TextField display;
    @FXML
    private Label welcomeText;

    public void appendNummer(String nummer){
        String currentNummer=display.getText();
        display.setText(currentNummer+nummer);
        results.clear();
    }

    Calcul calcul=new Calcul();


    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void deleteAction(ActionEvent event) {
        display.clear();
    }
    @FXML
    void displayAction(ActionEvent event) {
    }
    @FXML
    void resultAction(ActionEvent event) {
        String expresssion=display.getText();
       double result= Calcul.evaluer(expresssion);
        results.setText(String.format("%.2f",result));

    }

    public void button1Clicked(ActionEvent actionEvent) {
        appendNummer("1");
    }
    public void button2Clicked(ActionEvent actionEvent) {
        appendNummer("2");

    } public void button3Clicked(ActionEvent actionEvent) {
        appendNummer("3");

    } public void button4Clicked(ActionEvent actionEvent) {
        appendNummer("4");

    } public void button5Clicked(ActionEvent actionEvent) {
        appendNummer("5");

    } public void button6Clicked(ActionEvent actionEvent) {
        appendNummer("6");

    } public void button7Clicked(ActionEvent actionEvent) {
        appendNummer("7");

    } public void button8Clicked(ActionEvent actionEvent) {
        appendNummer("8");
    } public void button9Clicked(ActionEvent actionEvent) {
        appendNummer("9");
    } public void button0Clicked(ActionEvent actionEvent) {
        appendNummer("0");


    }
    public void buttonCommaClicked(ActionEvent actionEvent) {
        appendNummer(".");


    }
     public void closeParenFunk(ActionEvent actionEvent) {
         appendNummer(")");
         results.clear();

    }
    public void oppenParenFunk(ActionEvent actionEvent) {
        appendNummer("(");


    }


    public void add(ActionEvent actionEvent) {
        appendNummer("+");

    } public void sub(ActionEvent actionEvent) {
        appendNummer("-");


    } public void mul(ActionEvent actionEvent) {
        appendNummer("*");


    }
    public void div(ActionEvent actionEvent) {
        appendNummer("/");


    }
    public void mod(ActionEvent actionEvent) {
        appendNummer("%");


    }
    public void exp(ActionEvent actionEvent) {
        appendNummer("e");


    }


}