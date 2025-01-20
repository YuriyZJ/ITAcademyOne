package Lesson05;

//10. Составить программу, которая определит площадь какого круга меньше.

import java.util.Scanner;

public class Lesson05H08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Input the radius first of the circle:");
        a = sc.nextInt();
        System.out.println("Input the radius second of the circle:");
        b = sc1.nextInt();

        double s1 = Math.PI * Math.sqrt(a);
        double s2 = Math.PI * Math.sqrt(b);

        if (s1 < s2){
            System.out.println("Square 1 = " + s1 + " < Square 2 = " + s2);
        }
        else{
            System.out.println("Square 1 = " + s1 + " > Square 2 = " + s2);
        }
    }
}
