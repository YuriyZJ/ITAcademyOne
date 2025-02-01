package Tinkoff.T3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Количество дней
        int m = scanner.nextInt(); // Количество хороших дней

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); // Дистанции на каждый день
        }

        int minChanges = Integer.MAX_VALUE;

        for (int newA1 = 1; newA1 <= 1000; newA1++) { // Перебираем возможные значения a1 и a2
            for (int newA2 = 1; newA2 <= 1000; newA2++) {
                int changes = Math.abs(a[0] - newA1) + Math.abs(a[1] - newA2);
                int goodDays = 0;

                for (int i = 2; i < n; i++) {
                    int newAi = Math.max(newA1, Math.min(a[i], newA2));
                    if (newAi >= newA1 && newAi <= newA2) {
                        goodDays++;
                    }
                    changes += Math.abs(a[i] - newAi);
                }

                if (goodDays >= m) {
                    minChanges = Math.min(minChanges, changes);
                }
            }
        }
        System.out.println(minChanges);
        scanner.close();
    }
}
