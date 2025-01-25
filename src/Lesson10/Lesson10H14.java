package Lesson10;

//14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Random;

public class Lesson10H14 {
    public static void main(String[] args) {
        int size = 3;
        int[][] arr = new int[size][size];

        initialize("Первоначальный массив", arr);
        printArr(arr);
        sort("Отсортированный массив", arr);
        printArr(arr);

    }

    public static void initialize(String message, int[][] arr) {
        Random random = new Random();
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(1, 100);
            }
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("[%3d]", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void sort(String message, int[][] arr) {
        System.out.println(message);
        int n = 1;
        for (int i = 0; i < arr.length; i++){
            arr [i][arr[i].length - 1 - i] = i + 1;
        }
    }
}
