package com.ifmo.lesson2;

public class IsEven {
    /*
    Создать программу, проверяющую и сообщающую на экран, является ли целое число
    записанное в переменную n, чётным либо нечётным.
     */
    public static void main(String[] args) {
        int n = 11;

        System.out.println(isEven(n));
    }

    public static String isEven(int n) {
        // TODO implement
        // Допустимые строки: "Четное" или "Нечетное"
        int m = n % 2;
        String Number = null;
        if( m != 0) {
            Number = "Не четное";
        } else if (m == 0) {
            Number = "Четное";
        }
        return (Number);
    }
}
