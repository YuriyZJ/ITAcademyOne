package Lesson10;

import java.util.Random;

//2. Пузырьковая сортировка

public class Lesson10M02 {
        public static void main(String[] args) {
            int arr[] = new int[] {10, 11, 12, 14, 1, 2, 15, 5};
//            initialize(arr);
            display(arr);
            sort(arr);
            display(arr);
        }

/*        public static void initialize(int[] arr) {
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100);
            }
        }*/

        public static void display(int[] arr) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void sort(int[] arr) {
            boolean isSorted = false; // изначально массив считается не отсортированным.
            int buf;            //while (!isSorted) говорит: “пока массив не отсортирован, выполняем тело цикла”.
            while (!isSorted) { //!isSorted означает “пока массив не отсортирован”. Флаг isSorted позволяет избежать лишних итераций. Как только массив полностью отсортирован, цикл while завершится.
                isSorted = true; // предполагаем, что массив отсортирован
                for (int i = 0; i < arr.length - 1; i++) { // ограничиваемся длиной массива - последний, так как в алгоритме мы сравниваем предпоследний с последним и что бы не выйти за пределы массива
                    if (arr[i] > arr[i + 1]) {
                        isSorted = false;
                        buf = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = buf;
                    }
                    System.out.println(i + "-");
                    display(arr);
                }
            }
        }
    }
