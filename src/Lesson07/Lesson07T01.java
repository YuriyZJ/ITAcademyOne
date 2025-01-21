package Lesson07;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Lesson07T01 {
    public static void main(String[] args){
        double a;
        double b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        while(!sc.hasNextDouble()){
            sc.nextLine();
            System.out.println("Input first number one more time:");
        }
        a = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input second number:");
        while (!sc1.hasNextDouble()){
            sc1.nextLine();
            System.out.println("Input second number one more time:");
        }
        b = sc1.nextDouble();

        addition(a,b);
        composition(a,b);
    }

    public static void addition(double a, double b){
        double sum = a + b;
        System.out.println("The sum is: " + a + " + " + b + " = " + sum);
    }

    public static void composition (double a, double b){
        double comp = a * b;
        System.out.println("The composition is: " + comp);
    }
}
