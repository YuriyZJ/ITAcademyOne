package Lesson06;
import java.util.Scanner;

//8. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Lesson06H08 {
    public static void main(String[] args) {
        double c = 5;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Input coordinat otrezka a, b and step h : ");
        double a = sc.nextInt();
        double b = sc1.nextInt();
        double h = sc2.nextDouble();

        System.out.println("x\t\ty");

        for (double x = a; x <= b; x += h){
            double y;

            if (x == 15){
                y = (x + c) * 2;
            }
            else {
                y = (x - c) + 6;
            }
            System.out.printf("%.2f\t%.2f%n", x, y);
        }
    }
}
