package com.ifmo.lesson3;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement

        for(int i=0;i<randomNumbers.length;i++) System.out.print(randomNumbers[i] + " ");
       if(isIncreasingSequence(randomNumbers) == false){
           System.out.println("массив является строго возрастающей последовательностью");
       }else
       System.out.println("массив НЕ является строго возрастающей последовательностью");

    }

    public static int[] randomNumbers() {
        // TODO implement
        int randomNumbers[] = new int[4];
        for (int i = 0; i < randomNumbers.length; i++) randomNumbers[i] = (int) (Math.random() * 90 + 10);

        return randomNumbers;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        // TODO implement
        boolean sequence = false;
        for(int i=0;i<randomNumbers.length; i++) {
            if (i > 0) {
                if (randomNumbers[i - 1] >= randomNumbers[i]) {
                    sequence = true;
                }
            }
            if (i == randomNumbers.length) {
                sequence = false;
            }
        }
        return sequence;
    }
}
