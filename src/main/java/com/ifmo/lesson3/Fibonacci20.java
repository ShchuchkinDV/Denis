package com.ifmo.lesson3;

public class Fibonacci20 {
    /*
        Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
        что первый и второй члены последовательности равны единицам, а каждый следующий —
        сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();

        // TODO implement
        for (int i = 0; i < fibonacciNumbers.length; i++)System.out.print(fibonacciNumbers[i] + " ");


    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int[] fibonacciNumbers = new int[20];
        for (int i = 0; i < fibonacciNumbers.length; i++){
            if (i < 2) {
                fibonacciNumbers[i] = 1;
            }else {
                fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i-1];
            }
        }
        return fibonacciNumbers;
    }

}
