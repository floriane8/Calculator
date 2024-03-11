package com.flori.demo;

import java.util.List;

public class Calculator {

    public static double moyenneCalculation(List<Matiere> matieres){
        double moyenneCoefficier=0;
        int sommeCoefficient=0;

        for (Matiere matiere: matieres) {
            moyenneCoefficier += matiere.getNote() * matiere.getCoefficient();
            sommeCoefficient += matiere.getCoefficient();

        }
        if (sommeCoefficient!=0){
            double result=moyenneCoefficier/sommeCoefficient;
            System.out.println(result);
            return moyenneCoefficier/sommeCoefficient ;
        }
        else
            return 0;
    }


}
