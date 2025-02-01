package Tinkoff.T5;

import java.util.Scanner;

public class Сuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Количество сегментов
        long s = scanner.nextLong(); // Максимальная допустимая длина куска

        int[] segments = new int[n];
        for (int i = 0; i < n; i++) {
            segments[i] = scanner.nextInt();
        }

        long totalCuts = 0;

        for (int l = 0; l < n; l++) { // Пробегаем по всем подотрезкам (l, r) и считаем минимальное число частей
            long sum = 0;
            for (int r = l; r < n; r++) {
                sum += segments[r];

                totalCuts += (sum + s - 1) / s; // Считаем, сколько частей потребуется
            }
        }

        System.out.println(totalCuts);
        scanner.close();
    }
}
