package Lesson09;

//3. Дана матрица. Вывести на экран первый и последний столбцы.

import java.util.Random;

public class Lesson09T03 {
    public static void main(String[] args){
        int arr[][] = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(10);
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++){
            System.out.printf("[%2d]", arr[i][0]);
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++){
            System.out.printf("[%2d]", arr[i][arr[i].length - 1]);
        }
    }
}
