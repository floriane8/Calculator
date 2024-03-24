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
    private Button expo;
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
    }

    Calcul calcul=new Calcul();

    @FXML
    void add(ActionEvent event) {
       operator="+";
       number1=Double.parseDouble(display.getText());
       display.clear();
    }

    @FXML
    void divide(ActionEvent event) {
        operator="/";
        number1=Double.parseDouble(display.getText());
        display.clear();
    }

    @FXML
    void exp(ActionEvent event) {
        operator="exp";
        number1=Double.parseDouble(display.getText());
        display.clear();
    }
    @FXML
    void mod(ActionEvent event) {
        operator="%";
        number1=Double.parseDouble(display.getText());
        display.clear();
    }
    @FXML
    void mul(ActionEvent event) {
        operator="*";
        number1=Double.parseDouble(display.getText());
        display.clear();
    }
    @FXML
    void sub(ActionEvent event) {
        operator="-";
        number1=Double.parseDouble(display.getText());
        display.clear();
    }
    @FXML
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
        nummer2=Double.parseDouble(display.getText());
        double result=0;
        switch (operator){
            case "+":
                result=calcul.addFunk(number1,nummer2);
                break;
            case "-":
                result=calcul.subFunk(number1,nummer2);
                break;
            case "*":
                result=calcul.mulFunk(number1,nummer2);
                break;
            case "/":
                result=calcul.divFunk(number1,nummer2);
                break;
            case "%":
                result=calcul.modFunk(number1,nummer2);
                break;
            case "exp":
                result=calcul.expFunk(number1,nummer2);
                break;
        }
        display.setText(String.format("%.2f",result));

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
     public void buttonCloseParen(ActionEvent actionEvent) {
         appendNummer(")");
    }
    public void buttonOpenParen(ActionEvent actionEvent) {
        appendNummer("(");
    }
}