package Lesson10;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import java.util.Random;

public class Lesson10H09 {
    public static void main(String[] args) {

        int size = 3;

        int[][] arr = new int [size][size];

        initializeArray("Изначальная матрица", arr);
        printArray(arr);
        printSort("Отсортированная матрица", arr);

    }
    public static void initializeArray(String message, int[][] arr) {
        System.out.println(message);
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("[%5d]", arr[i][j]);
            }
        System.out.println();
        }
        System.out.println();
    }

    public static void printSort(String message, int[][] arr){
        System.out.println(message);
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.printf("[%5d]", arr[i][i]);
                } else {
                    System.out.printf("[%5s]", " - ");
                }
            }
                System.out.println();
        }
    }
}
