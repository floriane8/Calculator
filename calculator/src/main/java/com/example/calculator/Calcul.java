package com.example.calculator;
import java.util.Stack;

public class Calcul {





    public static double evaluer(String expression) {
        Stack<Double> nombres = new Stack<>();
        Stack<Character> operateurs = new Stack<>();
        StringBuilder currentNummer=new StringBuilder();

        for (char caractere : expression.toCharArray()) {
            if (Character.isDigit(caractere)) {// if the charachter is a number
                currentNummer.append(caractere);
            }
            else {
                if (currentNummer.length()>0) {
                    nombres.push(Double.parseDouble(currentNummer.toString()));
                    currentNummer.setLength(0);
                }

                if (caractere == '(') {
                    operateurs.push(caractere);
                } else if (caractere == ')') {
                    while (!operateurs.isEmpty() && operateurs.pop() != '(') {
                        double operande2 = nombres.pop();
                        double operande1 = nombres.pop();
                        char operateur = operateurs.pop();
                        nombres.push(effectuerOperation(operande1, operande2, operateur));
                    }
                    operateurs.pop(); // Retirer la parenthèse fermante  // i think it,s the opening brackets
                } else if (estOperateur(caractere)) {
                    while (!operateurs.isEmpty() && priorite(caractere) <= priorite(operateurs.peek())) {
                        double operande2 = nombres.pop();
                        double operande1 = nombres.pop();
                        char operateur = operateurs.pop();
                        nombres.push(effectuerOperation(operande1, operande2, operateur));
                    }
                    operateurs.push(caractere);

                }
            }
        }
        if (currentNummer.length() > 0) {
            nombres.push(Double.parseDouble(currentNummer.toString()));
        }

        while (!operateurs.isEmpty()) {
            double operande2 = nombres.pop();
            double operande1 = nombres.pop();
            char operateur = operateurs.pop();
            nombres.push(effectuerOperation(operande1, operande2, operateur));
        }

        return nombres.pop();
    }

    private static boolean estOperateur(char caractere) {
        return caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/'|| caractere =='e' ;
    }

    private static int priorite(char operateur) {
        switch (operateur) {
            case 'e':
                return 2;
            case '*':
            case '/':
                return 1;
            default:
                return 0;
        }
    }

    private static double effectuerOperation(double operande1, double operande2, char operateur) {
        switch (operateur) {
            case '+':
                return operande1 + operande2;
            case '-':
                return operande1 - operande2;
            case '*':
                return operande1 * operande2;
            case '/':
                if (operande2 == 0) {
                    throw new IllegalArgumentException("Division par zéro");
                }
                return operande1 / operande2;
            case '%':
                return operande1% operande2;
            case 'e':
                double result=1;
                while (operande2!=0){
                    result=result*operande1;
                    --operande2;
                }
                return result;

            default:
                throw new IllegalArgumentException("Opérateur invalide");
        }
    }




}
