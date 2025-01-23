package Lesson09;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

import java.util.Random;

public class Lesson09T02 {
    public static void main(String[] args){
        int[][] arr = new int[2][3];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = rand.nextInt(9);
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }
    }
}
