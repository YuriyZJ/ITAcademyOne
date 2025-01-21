package Lesson06;

//7. Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class Lesson06H07 {
    public static void main(String[] args) {
        double y;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Input coordinat otrezka a, b and step h : ");
        double a = sc.nextInt();
        double b = sc1.nextInt();
        double h = sc2.nextDouble();

        System.out.println("x\t\ty");

        for (double x = a; x <= b; x += h){ // цикл вычисления

            if (x > 2){
                y = x;
            }
            else{
                y = -x;
            }
        System.out.printf("%.2f\t%.2f%n", x, y );
        }
    }
}
