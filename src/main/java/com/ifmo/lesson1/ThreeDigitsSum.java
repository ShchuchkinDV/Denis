package com.ifmo.lesson1;

public class ThreeDigitsSum {
    /*
    В переменной n хранится натуральное трёхзначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */
    public static void main(String[] args) {
        int n = 123;

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {
        //TODO implement
        int h = n / 100;
        int m = (n - h * 100) / 10;
        int l = n % 10;

        return h + m + l;
    }
}
