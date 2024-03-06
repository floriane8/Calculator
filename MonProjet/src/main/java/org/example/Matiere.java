package org.example;

import java.util.List;

public class Matiere {

    private String subjectName;
    private int coefficient;
    private int note;

    Matiere(String subjectName, int coefficient, int note){
        this.subjectName=subjectName;
        this.coefficient=coefficient;
        this.note=note;
    }

   public double moyenneCalculation(List<Matiere>matieres){
        double moyenneCoefficier=0;
        int sommeCoefficient=0;

       for (Matiere matiere: matieres) {
           moyenneCoefficier += matiere.note * matiere.coefficient;
           sommeCoefficient += matiere.coefficient;

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
