package Lesson10;

public class Lesson10H15 {
    public static void main(String[] args){
        int size = 10;

        int[][] arr = new int[size][size];

        initialize(arr);
        printArr(arr);
    }

    public static void initialize(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i][i] = arr.length - i;
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
}
