package com.ifmo.lesson2;

public class Progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int x = 1000;
        for (; x <= 9999; x = x + 3) {
            System.out.println(x);
        }
    }
}
