package com.ifmo.lesson3;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for(int i=0;i<randomNumbers.length;i++) System.out.print(randomNumbers[i] + " ");
        System.out.print("\n");

        int evens = evens(randomNumbers);

        // TODO implement
        System.out.println("В массиве " + evens + " чётных элементов");
    }

    public static int[] randomNumbers() {
        // TODO implement
        int randomNumbers[] = new int[15];
        for (int i = 0; i < randomNumbers.length; i++) randomNumbers[i] = (int) (Math.random() * 9 + 0);

        return randomNumbers;
    }

    private static int evens(int[] randomNumbers) {
        // TODO implement
        int evens = 0;

        for(int i=0;i<randomNumbers.length;i++){
            if(randomNumbers[i] % 2 == 0) evens++;
        };

        return evens;
    }
}
