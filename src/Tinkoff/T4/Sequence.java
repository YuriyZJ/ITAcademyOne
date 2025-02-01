package Tinkoff.T4;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество элементов в последовательности
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        long[] a = new long[n]; // Последовательность чисел
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long minOperations = findMinOperations(a, x, y, z); // Вычисляем минимальное количество операций
        System.out.println(minOperations);
    }

    private static long findMinOperations(long[] a, int x, int y, int z) {
        long minOps = Long.MAX_VALUE;

        for (int i = 0; i < a.length; i++) { // Перебираем все возможные комбинации
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    long opsX = (a[i] % x == 0) ? 0 : (x - (a[i] % x));
                    long opsY = (a[j] % y == 0) ? 0 : (y - (a[j] % y));
                    long opsZ = (a[k] % z == 0) ? 0 : (z - (a[k] % z));

                    long totalOps = opsX + opsY + opsZ; // Общее количество операций

                    if (totalOps < minOps) {
                        minOps = totalOps;
                    }
                }
            }
        }
        return minOps;
    }
}
