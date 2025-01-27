package Lesson11;

public class Lesson11T1 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8};

        double result;

        try {
            result = summ(x, y);
            System.out.println("Результат вычисления: " + result);
        } catch (RuntimeException e) {
            System.err.println("Вычисление невозможно. " + e.getMessage());
        }
        System.out.println("Программа завершена.");
    }

    public static double summ(int[] x, int[] y) {
        double summa = 0;

        if (x == null || y == null || x.length != y.length) {
            throw new RuntimeException("Incorrect input is data");
        }

        int denominator;
        for (int i = 0; i < x.length; i++) {
            if ((denominator = x[i] + y[i]) == 0) {
                throw new RuntimeException("zero value");
            }
            summa = summa + 2.0 / denominator;
        }
            return summa;
    }
}