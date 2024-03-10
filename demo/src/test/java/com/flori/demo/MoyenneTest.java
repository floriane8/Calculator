package com.flori.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;


import static com.flori.demo.Calculator.moyenneCalculation;


public class MoyenneTest {
    @Test
public void moyenneCalculateTest() {
    Matiere matiere1 = new Matiere("info",2,15);
    Matiere matiere2 = new Matiere("Maths",4,18);
    Matiere matiere3 = new Matiere("TGdI",3,15);
    Matiere matiere4 = new Matiere("BWL",2,14);

    List<Matiere> matieres = List.of(new Matiere[]{matiere1, matiere2, matiere3, matiere4});
    moyenneCalculation(matieres);





}




}
