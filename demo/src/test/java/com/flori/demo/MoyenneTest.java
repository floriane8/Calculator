package com.flori.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;



public class MoyenneTest {

    Matiere matiere1 = new Matiere("info",9,16);
    Matiere matiere2 = new Matiere("Maths",8,15);
    Matiere matiere3 = new Matiere("TGdI",8,14);
    Matiere matiere4 = new Matiere("BWL",5,16);

    List<Matiere> matieres = List.of(new Matiere[]{matiere1, matiere2, matiere3, matiere4});
    @Test
public void moyenneCalculateTest() {

    Calculator.moyenneCalculation(matieres);
    boolean reponse=answer(15.2);
    Assertions.assertTrue(reponse);

    }

    //  test fo assertion
    public  boolean answer(double wert){
        return wert == Calculator.moyenneCalculation(matieres);

    }




}
