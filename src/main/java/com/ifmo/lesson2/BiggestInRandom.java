package com.ifmo.lesson2;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement
        final int min = 100;
        final int max = 999;
        int value = (int) (min + Math.random() * (max - min)) ;
        return value;
    }

    public static  String largestDigit(int rnd) {
        // TODO implement
        int max = 0;
        int first;
        int second;
        int third;
        if(rnd != 0) {
            first = rnd / 100;
            second = (rnd - first * 100) / 10;
            third = rnd - first * 100 - second * 10;
            if (first > second) {
                if (first > third)
                    max = first;
                else
                    max = third;
            } else {
                if (second > third)
                    max = second;
                else
                    max = third;
                }
            }
        return "В числе " + rnd + " наибольшая цифра " + max + ".";
        }
    }

