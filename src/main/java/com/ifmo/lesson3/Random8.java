package com.ifmo.lesson3;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for(int i=0;i<randomNumbers.length;i++) System.out.print(randomNumbers[i] + " ");
        System.out.print("\n");

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);

        // TODO implement
        for(int i=0;i<replacedWithZeros.length;i++) System.out.print(replacedWithZeros[i] + " ");
        
    }

    public static int[] randomNumbers() {
        // TODO implement
        int randomNumbers[] = new int[8];
        for (int i = 0; i < randomNumbers.length; i++) randomNumbers[i] = (int) (Math.random() * 10 + 1);

        return randomNumbers;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
        int[] replaceWithZeros = new int[8];
        for (int i = 0; i < randomNumbers.length; i++){
            if(i % 2 == 0 || i == 0)replaceWithZeros[i] = 0; else replaceWithZeros[i] = randomNumbers[i];
        }
        return replaceWithZeros;
    }
}
