package Lesson05;

//9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

import java.util.Scanner;

public class Lesson05H07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Введите 3 числа");

        int a = sc.nextInt();
        int b = sc1.nextInt();
        int c = sc2.nextInt();

        if (a == b && a == c && b == c){
            System.out.println("Треугольник равносторонний");
        }
        else{
            System.out.println("Повторите попытку ввода");
        }

    }

}
