package com.ifmo.lesson5;

public class Triangle extends Shape {
    private double a;
    private double h;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }
    public double area(){return  0.5 * a * h;}

}
