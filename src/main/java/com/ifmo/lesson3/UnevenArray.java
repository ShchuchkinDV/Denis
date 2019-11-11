package com.ifmo.lesson3;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();



        // TODO implement
        for (int i = 0; i < unevenArray.length; i++) {
            System.out.print(unevenArray[i]+" ");
        }
        System.out.println();
        for (int i = unevenArray.length-1; i >= 0; i--) {
            System.out.print(unevenArray[i]+" ");
        }
    }

    public static int[] unevenArray() {
        // TODO implement
        int a = 0;
        for(int i=1;i<=99;i++){
            if(i % 2 != 0)a++;

        }
        int[] array = new int[a];
        for(int i=1,b=0;i<=99;i++) {
            if (i % 2 != 0) {
                array[b] = i;
                b++;
            }
        }
        return array;
    }
}
