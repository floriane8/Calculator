package com.example.calculator;

public class Calcul {

    public double addFunk(double a, double b){
        return a+b;
    }

    public double subFunk(double a, double b){
        return a-b;
    }

    public double mulFunk(double a, double b){
        return a*b;
    }

    public double divFunk(double a, double b){
        if(b!=0) {
            return a / b;
        }
        else return 0;
    }

    public double modFunk(double a, double b){
        return a%b;
    }
    public double expFunk(double a, double b){
        double result=1;
        while (b!=0){
            result=result*a;
            --b;
        }
        return result;
    }

}
