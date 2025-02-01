package Tinkoff.T1;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        if (s.indexOf('R') < s.indexOf('M')) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
