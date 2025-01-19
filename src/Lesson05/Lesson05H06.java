package Lesson05;

//7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

import java.util.Scanner;

public class Lesson05H06 {
    public static void main(String[] args){
        int y;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc1.nextInt();
        int c = sc2.nextInt();
        int x = sc3.nextInt();

        y = Math.abs(a * x * x + b * x + c);
        System.out.println("Модуль выражения = " + y);

    }
}
