package Lesson05;
import java.util.Scanner;

public class Lesson05H01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc1.nextInt();

        if (x < y) {
            System.out.println(7);
        } else {
            System.out.println(8);
        }
    }
}

//1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.