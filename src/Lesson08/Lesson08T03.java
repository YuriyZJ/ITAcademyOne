package Lesson08;

//Даны действительные числа а1, а2, а3, ... ан. Поменять местами наибольший и наименьший элементы.

import java.util.Random;
import java.util.Scanner;

public class Lesson08T03 {
    public static void main(String[] args) {

        int min;
        int max;

        int indexMin;
        int indexMax;

        int size = 20;
        int[] massiv = new int[size];

        //double[] array = new double[] { 1, 2, 3, -5, 5, 6, -1, 3, 9, 10 };

        Random generator = new Random();

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = generator.nextInt(1000); // любые значения в пределе 1000
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.printf("[%3d]", massiv[i]);
        }

        System.out.println();

        min = massiv[0];
        indexMin = 0;
        max = massiv[0];
        indexMax = 0;
        for (int i = 0; i < size; i++){
            if (massiv[i] < min){
                min = massiv[i];
                indexMin = i;
            }
            if (massiv[i] > max){
                max = massiv[i];
                indexMax = i;
            }
        }
        System.out.println();

        massiv[indexMin] = max;
        massiv[indexMax] = min;

        for (int i = 0; i < size; i++) {
            System.out.printf("[%3d]", massiv[i]);
        }
    }
}
/*    public static void main(String[] args) {
        int min;
        int max;
        int iMin = 0;
        int iMax = 0;

        System.out.println("Input random number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

            System.out.println(array[i]);
        }

        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                iMin = i;
            }
        }
            System.out.println(min + " " + iMin);

        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                iMax = i;
            }
        }
            System.out.println(max + " " + iMax);


        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            }
            if (array[i] == min) {
                array[i] = max;
            }
            System.out.println(array[i] + " ");
        }
    }*/