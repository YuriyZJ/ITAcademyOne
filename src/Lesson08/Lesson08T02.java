package Lesson08;

//8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых чисел

import java.util.Random;
import java.util.Scanner;

public class Lesson08T02 {
    public static void main(String[] args){
        int negt = 0;
        int post = 0;
        int zero = 0;

        System.out.println("Input size array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] array = new double[n];
        Random random = new Random();


        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] < 0) {
                negt++;
            }
            else if (array[i] > 0){
                post++;
            }
            else{
                zero++;
            }
        }
        System.out.println(negt + "+" + post + "+" + zero);
    }
}
