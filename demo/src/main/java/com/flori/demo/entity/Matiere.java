package com.flori.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Matiere {

    private String subjectName;
    private int coefficient;
    private int note;
}
