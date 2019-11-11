package com.ifmo.lesson2;

import java.util.Scanner;

public class Dividers {
    /*
    Выведите на экран все положительные делители натурального числа, введённого
    пользователем с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // TODO implement
        int d = 0;
        for(int x = 1; x <= n; x++){
            if ((n % x) == 0){System.out.println(x);
            }
        }
    }
}
