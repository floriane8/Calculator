package com.flori.demo;


import com.flori.demo.entity.Matiere;
import com.flori.demo.service.GradeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class MoyenneTest {

    Matiere matiere1 = new Matiere("info", 9, 16);
    Matiere matiere2 = new Matiere("Maths", 8, 15);
    Matiere matiere3 = new Matiere("TGdI", 8, 14);
    Matiere matiere4 = new Matiere("BWL", 5, 16);

    List<Matiere> matieres = List.of(new Matiere[]{matiere1, matiere2, matiere3, matiere4});

    @Test
    public void calculateGradeTest1() {
        GradeService gradeService = new GradeService();
        double grade = gradeService.calculateGrade(matieres);

        Assertions.assertEquals(grade, 15.2);
    }

    @Test
    public void calculateGradeEmptyTest() {
        GradeService gradeService = new GradeService();
        double grade = gradeService.calculateGrade(null);

        Assertions.assertEquals(grade, 0);
    }


}
