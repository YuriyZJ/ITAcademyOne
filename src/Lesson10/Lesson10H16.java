package Lesson10;

public class Lesson10H16 {
    public static void main(String[] args){

        int size = 10;

        int[][] arr = new int[size][size];

        initialize(arr);
        printArr(arr);
    }

    public static void initialize(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            int n1 = i + 1;
            int n2 = i + 2;
            arr[i][i] = n1 * n2;
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