package com.ifmo.lesson2;

import javax.swing.*;

public class Count2 {
    /*
     В городе N есть большой склад на котором существует 50000 различных полок. Для
    удобства работников руководство склада решило заказать для каждой полки табличку с
    номером от 00001 до 50000 в местной типографии, но когда таблички напечатали, оказалось
    что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички, в
    номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо
    перепечатывать. Напишите программу, которая подсчитает сколько всего таких ошибочных
    табличек оказалось в бракованной партии.
     */
    public static void main(String[] args) {
        System.out.println(count2());
    }

    public static int count2() {
        // TODO implement
        int number = 0;
        int badcount = 0;
        for (; number <= 50000; number++) {
            if (number % 10 == 2) {
                badcount++;
            } else if (number / 10 % 10 == 2) {
                badcount++;
            } else if (number / 10 / 10 % 10 == 2) {
                badcount++;
            } else if (number / 10 / 10 / 10 % 10 == 2) {
                badcount++;
            } else if (number / 10 / 10 / 10 / 10 % 10 == 2) {
                badcount++;
            }
        }
        return badcount;
    }
}
