package com.ifmo.lesson2;

public class IsInInterval {
    /*
     Создать программу, которая будет проверять попало ли случайно выбранное из отрезка
    [5;155] целое число в интервал (25;100) и сообщать результат на экран.Примеры работы
    программы:
    Число 113 не содержится в интервале (25,100) Число 72 содержится в интервале (25,100) 
    Число 25 не содержится в интервале (25,100) Число 155 не содержится в интервале (25,100) 
     */
    public static void main(String[] args) {
        int rnd = randomInt();

        String inInterval = isInInterval(rnd);

        // TODO implement
        System.out.print("Число " + rnd + inInterval);
    }

    public static int randomInt() {
        // TODO implement
        final int min = 5;
        final int max = 155;
        int value = (int) (min + Math.random() * (max - min)) ;

        return value;
    }

    public static String isInInterval(int rnd) {
        // TODO implement
        String Number = null;
        if(rnd<=25||rnd>=100){
            Number = " не содержится в интервале (25,100)";
        }
        else {
            Number = " содержится в интервале (25,100)";
        }


        return Number;
    }

}
