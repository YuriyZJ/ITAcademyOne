package Lesson06;

//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

import java.util.Scanner;

public class Lesson06H14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;

        for (double i = 1; i <= n; i++){
            sum += 1/i;
        }
        System.out.println(sum);
    }
}
