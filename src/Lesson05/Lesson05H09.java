package Lesson05;

//12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

import java.util.Scanner;

public class Lesson05H09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Input free different numbers:");

        double a = sc.nextDouble();
        double b = sc1.nextDouble();
        double c = sc2.nextDouble();

        if (a > 0) {
            double a1 = Math.sqrt(a);
            System.out.println(a1);
        }
        else {
            double a1 = Math.pow(a, 4);
            System.out.println(a1);
        }
        if (b > 0) {
            double b1 = Math.sqrt(b);
            System.out.println(b1);
        }
        else {
            double b1 = Math.pow(b, 4);
            System.out.println(b1);
        }
        if (c > 0) {
            double c1 = Math.sqrt(c);
            System.out.println(c1);
        }
        else {
            double c1 = Math.pow(c, 4);
            System.out.println(c1);
        }
/*        else{
            double a1 = Math.pow(a, 4);
            double b1 = Math.pow(b, 4);
            double c1 = Math.pow(c, 4);
            System.out.println(a1);
            System.out.println(b1);
            System.out.println(c1);
        }*/
    }
}
