package Lesson09;

//Решите задачу. Получить квадратную матрицу порядка n:

public class Lesson09M02 {

    public static void main(String[] args) {
        int n = 6;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            mas[i][i] = i;
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
