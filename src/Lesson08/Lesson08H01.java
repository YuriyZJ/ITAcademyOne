package Lesson08;

// В массиве заданного размера занесены натуральные числа. Вывести сумму чисел, которые крытны K.

import java.util.Random;

public class Lesson08H01 {
    public static void main(String[] args) {
        Random generator = new Random();
        Random generator1 = new Random();

        int n = generator.nextInt(10); // количество членов в массиве

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = generator1 .nextInt(100);

            System.out.printf("[%3d]", arr[i]);
        }

        int k = 2;
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % k == 0){
                sum += arr[i];
            }
        }
        System.out.println("\nSum= " + sum);
    }
}
