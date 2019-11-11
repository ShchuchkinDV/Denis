package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int x = 1;
        int y = 1;
        int z;
        System.out.print(x+" "+y+" ");
        for (int i = 3; i <= 11; i++){
            z = x+y;
            System.out.print(z+" ");
            x = y;
            y = z;
        }
        System.out.println();
    }
}
