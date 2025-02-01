package Tinkoff.T6;

import java.util.Scanner;

public class Happy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество точек
        int[][] points = new int[n][2]; // Массив для хранения координат точек

        for (int i = 0; i < n; i++) { // Чтение координат точек
            points[i][0] = scanner.nextInt(); // x
            points[i][1] = scanner.nextInt(); // y
        }

        int count = 0; // Счетчик счастливых троек

        for (int i = 0; i < n - 2; i += 3) { // Перебор точек с шагом 3
            int[] p1 = points[i];
            int[] p2 = points[i + 1];
            int[] p3 = points[i + 2];

            if (!isCollinear(p1, p2, p3)) {
                count++;
            }
        }

        System.out.println(count); // Вывод результата
    }

    private static boolean isCollinear(int[] p1, int[] p2, int[] p3) { // Метод для проверки, образуют ли точки невырожденный треугольник
        int area = Math.abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1]))/2;
        return area == 0; // Если площадь равна нулю, точки лежат на одной прямой
    }
}


/*    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean isValidTriangle(Point a, Point b, Point c) {
        return (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) != 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Количество жителей
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }

        boolean[] used = new boolean[n]; // Отмечаем, какие люди уже в тройках
        int maxTriplets = 0;

        for (int i = 0; i < n; i++) {
            if (used[i]) continue;
            for (int j = i + 1; j < n; j++) {
                if (used[j]) continue;
                for (int k = j + 1; k < n; k++) {
                    if (used[k]) continue;

                    // Проверяем, образуют ли эти 3 человека счастливую тройку
                    if (isValidTriangle(points[i], points[j], points[k])) {
                        used[i] = used[j] = used[k] = true;
                        maxTriplets++;
                        break; // Переходим к следующей тройке
                    }
                }
            }
        }

        System.out.println(maxTriplets);
        scanner.close();
    }
}*/
