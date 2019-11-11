package com.ifmo.lesson5;

public class Oval extends Shape {
    private double r1;
    private double r2;

    public Oval(double r1, double r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    public double area() {
        return 3.14d * r1 * r2;
    }
}
