package Lesson09;

//Дана матрица размера m x n. Вывести ее элементы в
//следующем порядке: первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.

import java.util.Random;

public class Lesson09M01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = rand.nextInt(10) + 1;
        int n = rand.nextInt(10) + 1;
        int[][] mas = new int[m][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1000);
                if (rand.nextInt(1000) % 3 == 0) {
                    mas[i][j] = -mas[i][j];
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {    //сначала выводит 1 строку, цикл заканчивается
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
            i++;
            if (i >= mas.length) {
                break;
            }
            for (int j = mas[i].length - 1; j >= 0; j--) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
