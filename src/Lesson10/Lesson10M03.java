package Lesson10;

import java.util.Random;

//3. Сортировка вставками

public class Lesson10M03 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        initialize(arr);
        display(arr);
        sort(arr);
        display(arr);
    }
    public static void initialize(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
    public static void display(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > currElem) {
                arr[prevKey + 1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
    }
}