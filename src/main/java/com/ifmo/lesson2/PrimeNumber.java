package com.ifmo.lesson2;

import java.util.Scanner;

public class PrimeNumber<a, check> {
    /*
    Проверьте, является ли введённое пользователем с клавиатуры натуральное число —
    простым. Постарайтесь не выполнять лишних действий (например, после того, как вы нашли
    хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать
    не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще
    имеется, обязательно располагается в отрезке [2; √n].

    1 не считается простым числом.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean prime = isPrime(n);

        System.out.println(prime);
    }

    public static boolean isPrime(int n) {
        // TODO implement
        boolean check =  false;
        for(int i = n / n ;i >= 1; i--){
            if(n % i == 0 & i != 1 ){
                check = false;
                break;
            }else if (i == 1) {
                check = true;
            }
        }
            return check;
    }
}
