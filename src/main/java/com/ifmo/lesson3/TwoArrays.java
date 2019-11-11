package com.ifmo.lesson3;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        // TODO implement
        for(int i=0;i<randomNumbers1.length;i++) System.out.print(randomNumbers1[i] + " ");
        System.out.print("\n");
        for(int i=0;i<randomNumbers2.length;i++) System.out.print(randomNumbers2[i] + " ");
        System.out.print("\n");

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);

        // TODO implement
        if(average1 == average2)
            System.out.print("Среднее арифмитеческое обоих массивов равно");
        if (average1 > average2)
            System.out.print("Среднее арифмитеческое первого массива больше второго");
        if (average1 > average2)
            System.out.print("Среднее арифмитеческое втрорго массива больше первого");

    }

    public static int[] randomNumbers() {
        // TODO implement
        int randomNumbers[] = new int[5];
        for (int i = 0; i < randomNumbers.length; i++) randomNumbers[i] = (int) (Math.random() * 5 + 0);

        return randomNumbers;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int sum = 0;
        for(int i=0;i<randomNumbers.length;i++)sum += randomNumbers[i];

        return sum / randomNumbers.length;
    }
}
