package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;




public class MoyenneTest {
    @Test
public void moyenneCalculateTest() {
    Matiere matiere1 = new Matiere("maths", 8, 15);
    Matiere matiere2 = new Matiere("info1", 9, 16);
    Matiere matiere3 = new Matiere("info2", 8, 16);
    Matiere matiere4 = new Matiere("TheoInfo", 5, 15);

    List<Matiere> matieres = List.of(new Matiere[]{matiere1, matiere2, matiere3, matiere4});
    matiere2.moyenneCalculation(matieres);


}




}
