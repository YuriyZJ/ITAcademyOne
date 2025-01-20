package Lesson06;

//6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Lesson06H06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= x; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
