package com.flori.demo;

import java.util.List;

public class Matiere {

    private String subjectName;
    private int coefficient;
    private int note;

    public Matiere(String subjectName,int coefficient, int note){
        this.note=note;
        this.subjectName=subjectName;
        this.coefficient=coefficient;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }

    public int getCoefficient(){
        return coefficient;
    }
    public void setCoefficient(int coefficient){
        this.coefficient=coefficient;
    }
    public int getNote(){
        return note;
    }
    public void setNote(int note){
        this.note=note;
    }





}
