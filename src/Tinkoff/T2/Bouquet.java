package Tinkoff.T2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> powers = new ArrayList<>();  // Вычисляем максимальную степень двойки, не превышающую 10^18
        long value = 1;
        long limit = (long) 1e18;

        while (value <= limit) {
            powers.add(value);
            value *= 2;
        }

        int n = scanner.nextInt(); // Количество дней
        for (int i = 0; i < n; i++) {
            long budget = scanner.nextLong();
            System.out.println(findMaxFlowerCost(powers, budget));
        }
        scanner.close();
    }

    private static long findMaxFlowerCost(List<Long> powers, long budget) {
        int size = powers.size();
        long maxCost = -1;

        for (int i = 0; i < size; i++) { // Перебираем все возможные комбинации трех различных степеней двойки
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    long sum = powers.get(i) + powers.get(j) + powers.get(k);
                    if (sum <= budget) {
                        maxCost = Math.max(maxCost, sum);
                    }
                }
            }
        }
        return maxCost;
    }
}


    /*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] powers = new long[61]; // Самая большая степень двойки, не превышающая  10^18 , это  2^60 .
        for (int i = 0; i < 61; i++) {
            powers[i] = (long) Math.pow(2, i); // 2^i
        }

        while (n-- > 0) {
            long a = scanner.nextLong();
            long maxSum = -1;

            for (int i = 0; i < 61; i++) { // Перебираем все комбинации трёх разных степеней двойки
                for (int j = i + 1; j < 61; j++) {
                    for (int k = j + 1; k < 61; k++) {
                        long sum = powers[i] + powers[j] + powers[k];
                        if (sum <= a) {
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
            System.out.println(maxSum);
        }
    }
}*/
