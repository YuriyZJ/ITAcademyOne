package Lesson09;

//4. Дана матрица. Вывести на экран первую и последнюю строки.

import java.util.Random;

public class Lesson09T04 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
                System.out.printf("[%2d]", array[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.printf("[%2d]", array[0][i]);
        }
    }
}
