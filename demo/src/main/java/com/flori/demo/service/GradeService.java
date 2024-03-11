package com.flori.demo.service;

import com.flori.demo.entity.Matiere;

import java.util.List;

/***
 * @author floriane monga
 * this class calculate grades of students.
 */

public class GradeService {
    public double calculateGrade(List<Matiere> matieres) {
        if (matieres == null || matieres.isEmpty()) {
            return 0;
        }
        double moyenneCoefficier = 0;
        int sommeCoefficient = 0;

        for (Matiere matiere : matieres) {
            moyenneCoefficier += matiere.getNote() * matiere.getCoefficient();
            sommeCoefficient += matiere.getCoefficient();

        }
        if (sommeCoefficient != 0) {
            double result = moyenneCoefficier / sommeCoefficient;
            System.out.println(result);
            return moyenneCoefficier / sommeCoefficient;
        } else {
            return 0;
        }
    }
}
