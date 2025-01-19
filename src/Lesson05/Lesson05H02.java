package Lesson05;

import java.util.Scanner;

//2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»

public class Lesson05H02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc1.nextInt();

        if (x < y){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
