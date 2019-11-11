package com.ifmo.lesson3;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement


        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        // TODO implement
        System.out.println("Индекс последнего вхождения в массив максимального числа " + maxLastIndex);
    }

    public static int[] randomNumbers() {
        // TODO implement
        int randomNumbers[] = new int[12];
        for (int i = 0; i < randomNumbers.length; i++) randomNumbers[i] = (int) Math.floor(Math.random() * 31) - 15;


        return randomNumbers;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int max = randomNumbers[0];
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] >= max) max = randomNumbers[i];
        }
        return 0;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement
                int  index = 0;
                for (int i = 0; i < randomNumbers.length; i++) {
                    if (randomNumbers[i] >= max) index = i;
                }

        return index;
    }
}
