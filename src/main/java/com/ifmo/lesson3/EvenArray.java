package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();

        // TODO implement
        for (int i = 0; i < evenArray.length; i++)System.out.print(evenArray[i] + " ");
        for (int i = 0; i < evenArray.length; i++)System.out.print("\n" + evenArray[i]);
    }


    public static int[] evenArray() {
        // TODO implement
        int[] evenArray = new int[20 / 2];
        int i = 0;
        int j = 2;
        for (; i <evenArray.length; i++, j += 2) {
            evenArray[i] = j;
        }
        return evenArray;
    }
}