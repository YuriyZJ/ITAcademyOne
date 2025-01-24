package Lesson10;

import java.util.Random;
//1. Сортировка выбором

public class Lesson10M01 {
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
            int pos;
            int temp;
            for (int i = 0; i < arr.length; i++) {
                pos = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[pos]) {
                        pos = j;
                    }
                }
                temp = arr[pos]; // после прохождение второго цикла и определения мин значения, происходит замена первого значения под индексом i
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
}

