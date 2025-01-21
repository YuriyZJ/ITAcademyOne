package Lesson06;

//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

import java.util.Scanner;

public class Lesson06H17 {
    public static void main(String[] args){
        double sum = 0;
        double prod = 1;

        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);

        double a = sc.nextDouble();
        int n = sc1.nextInt();

        for (double i = 0; i < n; i++){
            prod *= (a + i);
        }
        System.out.println(prod);
    }
}
