package com.flori.gradeapp;

import javafx.beans.property.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class MatiereDto {

    private String name;
    private String coefficient;
    private String note;

    public StringProperty nameProperty(){
        return new SimpleStringProperty(name);
    }

    public StringProperty coeffProperty(){
        return new SimpleStringProperty(coefficient);
    }
    public StringProperty noteProperty(){
        return new SimpleStringProperty(note);
    }
}
