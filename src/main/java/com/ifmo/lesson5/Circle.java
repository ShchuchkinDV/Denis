package com.ifmo.lesson5;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }
    public double area(){
        return 3.14d * r * r;
    }
}
