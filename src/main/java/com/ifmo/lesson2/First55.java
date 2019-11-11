package com.ifmo.lesson2;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        // TODO implement
        int x = 1;
        System.out.println(x);
        for(int i = 1; i <= 55; i++){
            x = x + 2;
            System.out.println(x);
        }
    }
}
