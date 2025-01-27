package Lesson10;

public class Lesson10H17 {
    public static void main(String[] args) {
        int size = 4;

        int[][] arr = new int[size][size];

        initialize(arr);
        printArr(arr);

    }

    public static void initialize(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1) {
                    arr[i][j] = 1;
                }
                if (j == 0 || j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("[%4d]", arr[i][j]);
            }
            System.out.println();
        }
    }

}
