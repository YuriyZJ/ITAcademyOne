package Lesson05;

//4. Составить программу: равны ли два числа а и b?

import java.util.Scanner;

public class Lesson05H04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        double c;
        double d;
        System.out.println("Vvedite 2 chisla");

        double a = sc.nextDouble();
        double b = sc1.nextDouble();

        while (a != b){
            sc.nextInt();
            sc1.nextInt();
            sc.nextDouble();
            sc1.nextDouble();
            System.out.println("Vvedite snova");
        }
        if (a == b){
            System.out.println("Good, go next task");
        }
    }
}
