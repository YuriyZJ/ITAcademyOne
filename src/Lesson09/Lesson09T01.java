package Lesson09;

//1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.

import java.util.Random;

public class Lesson09T01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++){
            //arr[i][0] = 1;
            //arr[i][arr[i].length-1] = 1;
            arr[i][i] = 1;
        }


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }

    }
}
/*
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = rand.nextInt(2);
                System.out.printf("[%2d]", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == 1 && count <= 1){
                    count++;
                }
                else if (arr[i][j] == 1 && count >= 2){
                    arr[i][j] = 0;
                }
                System.out.printf("[%2d]" , arr[i][j]);
            }
            System.out.println();
        }
    }
*/
