package Lesson05;
import java.util.Scanner;
//6. Составить программу: определения наибольшего из двух чисел а и b.

public class Lesson05H05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("a > b");
        }
        else{
            System.out.println("a < b");
        }
    }
}
